package com.training.model;

import java.util.Optional;

public class Car {

	private Optional<Insurance> insurance;

	public Car() {
		super();
	}

	public Optional<Insurance> getInsurance() {
		return insurance;
	}

	public void setInsurance(Optional<Insurance> insurance) {
		this.insurance = insurance;
	}

}
