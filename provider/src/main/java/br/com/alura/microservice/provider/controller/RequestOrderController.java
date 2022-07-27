package br.com.alura.microservice.provider.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.provider.dto.OrderItemDTO;
import br.com.alura.microservice.provider.model.RequestOrder;
import br.com.alura.microservice.provider.service.RequestOrderService;

@RestController
@RequestMapping("/order")
public class RequestOrderController {
	
	private static final Logger LOG = LoggerFactory.getLogger(RequestOrderController.class);

	@Autowired
	private RequestOrderService orderService;
	
	@RequestMapping(method = RequestMethod.POST)
	public RequestOrder order(@RequestBody List<OrderItemDTO> items) {
		LOG.info("Request order received");
		return orderService.order(items);
	}
	
	@RequestMapping("/{id}")
	public RequestOrder getOrderById(@PathVariable Long id) {
		LOG.info("Getting order by id {}", id);
		return orderService.getOrderById(id);
	}

}
