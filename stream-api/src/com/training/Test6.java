package com.training;

import com.training.model.MyInterface;
import com.training.model.MyInterfaceImpl;

public class Test6 {
	public static void main(String[] args) {
		
		MyInterface m = new MyInterfaceImpl();
		
		m.display();
		m.calculate(12,  45);
		MyInterface.print();		
	}
}
