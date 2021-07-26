package com.training;

import java.util.Optional;

import com.training.model.Car;
import com.training.model.Insurance;
import com.training.model.Person;

public class Test3 {

	public static void main(String[] args) {
		
//		Insurance insurance = new Insurance("ABC Pvt Ltd");
//		Car car = new Car(insurance);
//		Person person = new Person(car);
//		
//		String insuranceCompanyName = getInsuranceCompanyName(person);
//		System.out.println(insuranceCompanyName);
		
		Insurance insurance = new Insurance("ABC Pvt Ltd");
		
		Car car = new Car();
		// Optional<Insurance> i = Optional.ofNullable(insurance);
		car.setInsurance(Optional.ofNullable(insurance));
		
		Person person = new Person();
		// Optional<Car> c = Optional.ofNullable(car);
		person.setCar(Optional.ofNullable(car));
		
		String insuranceCompanyName = getInsuranceCompanyName(person);
		System.out.println(insuranceCompanyName);
		
	}
	
	public static String getInsuranceCompanyName(Person person) {
		
//		if (person != null) {
//			Car car = person.getCar();
//			if (car != null) {
//				Insurance insurance = car.getInsurance();
//				if(insurance != null) {
//					return insurance.getName();
//				}
//			}
//		}
//		return "Unknown";
		
//		final String defaultName = "Unknown";
//		
//		if (person == null) 
//			return defaultName;
//		
//        Car car = person.getCar();
//        if (car == null) 
//        	return defaultName;
//        
//        Insurance insurance = car.getInsurance();
//        if (insurance == null) 
//        	return defaultName;
//        
//        return insurance.getName(); 
		
//		Insurance insurance = new Insurance("ABC Pvt Ltd");
//		 Optional<Insurance> optInsurance = Optional.ofNullable(insurance);
//		Optional<Insurance> optInsurance = Optional.empty();
		
		// We can consider optional object as a stream containing only one value (it may be a complex object or collection object).
		
//	   return optInsurance.map(i -> i.getName())    
//             	                     .orElse("Unknown");
	     
		// Final Code using Optional.
	    
      Optional<Car> optCar =  person.getCar();
           
     return  optCar.flatMap(car -> car.getInsurance())
                		   .map(insurance -> insurance.getName())
                		   .orElse("Unknown");
                
                
	}
}














