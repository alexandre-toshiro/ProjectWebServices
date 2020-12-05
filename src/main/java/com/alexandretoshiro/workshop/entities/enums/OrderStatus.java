package com.alexandretoshiro.workshop.entities.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1), PAID(2), SHIPPED(3), DELIVERED(4), CANCELED(5);
	// Colocar um número para cada enum, de modo a facilitar a verificação/manutenção no banco.
	
	private int code;

	//Construtor do tipo enumerado é private
	private OrderStatus(int code) {
		this.code = code;

	}

	public int getCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid OrderStatus code");
	}

}
