package br.com.alura.microservice.shop.controller.dto;

public class AddressDTO {

	
	private String street;
	private String number;
	private String complement;
	private String state;
	private String zipCode;
	
	
	@Override
	public String toString() {
		return "street:" + street + ", number:" + number + ", complement:" + complement + ", state:" + state
				+ ", zipCode:" + zipCode;
	}

	public String getStreet() {
		return street;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getComplement() {
		return complement;
	}
	
	public void setComplement(String complement) {
		this.complement = complement;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZipCode() {
		return zipCode;
	}
	
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
