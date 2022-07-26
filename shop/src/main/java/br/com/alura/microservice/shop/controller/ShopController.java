package br.com.alura.microservice.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.shop.controller.dto.ShopDTO;
import br.com.alura.microservice.shop.service.ShopService;

@RestController
@RequestMapping("/shop")
public class ShopController {
	
	@Autowired
	private ShopService shopService;
	
	@RequestMapping(method = RequestMethod.POST)
	public void shop(@RequestBody ShopDTO shop) {
		shopService.shop(shop);
	}

}
