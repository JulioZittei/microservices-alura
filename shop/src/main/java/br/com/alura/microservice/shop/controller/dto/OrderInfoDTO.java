package br.com.alura.microservice.shop.controller.dto;

public class OrderInfoDTO {

	private Long id;
	
	private Integer preparationTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPreparationTime() {
		return preparationTime;
	}

	public void setPreparationTime(Integer preparationTime) {
		this.preparationTime = preparationTime;
	}
}
