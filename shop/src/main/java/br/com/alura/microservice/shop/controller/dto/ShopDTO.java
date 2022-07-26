package br.com.alura.microservice.shop.controller.dto;

import java.util.List;

public class ShopDTO {

	
	private List<ShopItemDTO> items;
	
	private AddressDTO address;

	public List<ShopItemDTO> getItems() {
		return items;
	}

	public void setItems(List<ShopItemDTO> items) {
		this.items = items;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}
	
}
