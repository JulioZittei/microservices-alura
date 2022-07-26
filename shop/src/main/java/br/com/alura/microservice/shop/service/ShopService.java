package br.com.alura.microservice.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import br.com.alura.microservice.shop.controller.dto.InfoProviderDTO;
import br.com.alura.microservice.shop.controller.dto.ShopDTO;

@Service
public class ShopService {

	@Autowired
	private RestTemplate client;
	
	@Autowired
	private DiscoveryClient eurekaClient;
	
	public void shop(ShopDTO shop) {
		
		ResponseEntity<InfoProviderDTO> exchange = 
				client.exchange("http://provider/info/" + shop.getAddress().getState(), 
				HttpMethod.GET, null, InfoProviderDTO.class);
		
		eurekaClient.getInstances("provider").stream().forEach((provider) -> {
			System.out.println("localhost:" + provider.getPort());
		});;
		
		System.out.println(exchange.getBody().getAddress());
	}
}
