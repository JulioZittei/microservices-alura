package br.com.alura.microservice.shop.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.alura.microservice.shop.controller.dto.InfoProviderDTO;
import br.com.alura.microservice.shop.controller.dto.OrderInfoDTO;
import br.com.alura.microservice.shop.controller.dto.ShopItemDTO;

@FeignClient("provider")
public interface ProviderClient {

	@RequestMapping("/info/{state}")
	public InfoProviderDTO getInfoByState(@PathVariable String state);

	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public OrderInfoDTO order(List<ShopItemDTO> items);
}
