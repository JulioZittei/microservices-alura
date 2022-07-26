package br.com.alura.microservice.provider.dto;

public class RequestOrderDTO {
	
	private Long orderId;
	
	private Integer preparationTime;

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Integer getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}
	
	
}
