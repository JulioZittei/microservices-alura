package br.com.alura.microservice.shop.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.shop.client.ProviderClient;
import br.com.alura.microservice.shop.controller.dto.InfoProviderDTO;
import br.com.alura.microservice.shop.controller.dto.OrderInfoDTO;
import br.com.alura.microservice.shop.controller.dto.ShopDTO;
import br.com.alura.microservice.shop.model.Shop;

@Service
public class ShopService {
	
	private static final Logger LOG = LoggerFactory.getLogger(ShopService.class);

	@Autowired
	private ProviderClient providerClient;
	
	public Shop shop(ShopDTO shop) {
		
		final String state = shop.getAddress().getState();
		
		LOG.info("Finding provider information by state {}", state);
		InfoProviderDTO infoProvider = providerClient.getInfoByState(shop.getAddress().getState());
		
		LOG.info("Requesting order");
		OrderInfoDTO order = providerClient.order(shop.getItems());
		Shop orderedShop = new Shop();
		orderedShop.setOrderedId(order.getId());
		orderedShop.setPreparationTime(order.getPreparationTime());
		orderedShop.setDestinationAddress(shop.getAddress().toString());
		return orderedShop;

	}
}
