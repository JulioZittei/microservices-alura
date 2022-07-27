package br.com.alura.microservice.provider.service;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.provider.dto.OrderItemDTO;
import br.com.alura.microservice.provider.model.OrderItem;
import br.com.alura.microservice.provider.model.Product;
import br.com.alura.microservice.provider.model.RequestOrder;
import br.com.alura.microservice.provider.repository.ProductRepository;
import br.com.alura.microservice.provider.repository.RequestOrderRepository;

@Service
public class RequestOrderService {
	
	private static final Logger LOG = LoggerFactory.getLogger(RequestOrderService.class);
	
	@Autowired
	private RequestOrderRepository requestOrderRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public RequestOrder order(List<OrderItemDTO> items) {
		
		if(items == null) {
			return null;
		}
		
		LOG.info("Creating order");
		List<OrderItem> orderItems = toOrderItem(items);
		RequestOrder order = new RequestOrder(orderItems);
		order.setPreparationTime(items.size());
		return requestOrderRepository.save(order);
	}
	
	public RequestOrder getOrderById(Long id) {
		
		LOG.info("Finding order by id {}", id);
		return requestOrderRepository.findById(id).orElse(new RequestOrder());
	}
	
	private List<OrderItem> toOrderItem(List<OrderItemDTO> items) {
		
		List<Long> ids = items
				.stream()
				.map((item) -> item.getId())
				.collect(Collectors.toList());
		
		List<Product> products = productRepository.findByIdIn(ids);
		
		List<OrderItem> orderItems = items
				.stream()
				.map((item) -> {
					Product product = products
							.stream()
							.filter((p) -> p.getId() == item.getId())
							.findFirst().get();
					
					OrderItem orderItem = new OrderItem();
					orderItem.setProduct(product);
					orderItem.setQuantity(item.getQuantity());
					return orderItem;
				}).collect(Collectors.toList());
		return orderItems;
	}

}
