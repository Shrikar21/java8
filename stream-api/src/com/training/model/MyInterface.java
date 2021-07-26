package com.training.model;


public interface MyInterface {
	
	public void calculate(int x, int y);
	
	default void display() {
		System.out.println("Inside default display() method");
	}
		
	// static methods are utility method.
	static void print() {
		System.out.println("Inside static print() method.");		
	}
	
}
