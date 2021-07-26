package com.training.model;

public class BiCycle {

	private String brand;

	public BiCycle() {
		super();
	}

	public BiCycle(String brand) {
		super();
		this.brand = brand;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "BiCycle [brand=" + brand + "]";
	}

}
