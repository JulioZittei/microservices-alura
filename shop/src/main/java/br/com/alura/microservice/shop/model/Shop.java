package br.com.alura.microservice.shop.model;

public class Shop {
	
	private Long orderedId;
	
	private Integer preparationTime;
	
	private String destinationAddress;

	public Long getOrderedId() {
		return orderedId;
	}

	public void setOrderedId(Long id) {
		this.orderedId = id;
	}

	public Integer getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}

	public String getDestinationAddress() {
		return destinationAddress;
	}

	public void setDestinationAddress(String destinationAddress) {
		this.destinationAddress = destinationAddress;
	}
}
