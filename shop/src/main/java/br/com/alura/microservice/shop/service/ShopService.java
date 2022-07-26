package br.com.alura.microservice.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.alura.microservice.shop.client.ProviderClient;
import br.com.alura.microservice.shop.controller.dto.InfoProviderDTO;
import br.com.alura.microservice.shop.controller.dto.OrderInfoDTO;
import br.com.alura.microservice.shop.controller.dto.ShopDTO;
import br.com.alura.microservice.shop.model.Shop;

@Service
public class ShopService {

	@Autowired
	private ProviderClient providerClient;
	
	public Shop shop(ShopDTO shop) {
		
		InfoProviderDTO infoProvider = providerClient.getInfoByState(shop.getAddress().getState());
		
		OrderInfoDTO order = providerClient.order(shop.getItems());
		Shop orderedShop = new Shop();
		orderedShop.setOrderedId(order.getId());
		orderedShop.setPreparationTime(order.getPreparationTime());
		orderedShop.setDestinationAddress(shop.getAddress().toString());
		return orderedShop;

	}
}
