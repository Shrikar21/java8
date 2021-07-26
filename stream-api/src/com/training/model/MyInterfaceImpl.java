package com.training.model;

public class MyInterfaceImpl implements MyInterface {

	@Override
	public void calculate(int x, int y) {
		System.out.println("Addition => " + (x + y));
	}

	@Override
	public void display() {
		System.out.println("Inside MyInterfaceImpl class display() method");
	}
}
