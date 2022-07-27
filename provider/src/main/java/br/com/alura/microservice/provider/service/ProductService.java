package br.com.alura.microservice.provider.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.provider.model.Product;
import br.com.alura.microservice.provider.repository.ProductRepository;

@Service
public class ProductService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ProductService.class);
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getProductsByState(String state) {
		
		LOG.info("Finding products by state {}", state);
		return productRepository.findByState(state);
	}

}
