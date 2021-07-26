package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.training.model.BiCycle;
import com.training.model.Dish;
import com.training.model.DishType;

public class Test7 {

	public static void main(String[] args) {

		List<Dish> menu = new ArrayList<>();

		menu.add(new Dish("Chicken", false, 800, DishType.MEAT));
		menu.add(new Dish("Mutton", false, 900, DishType.MEAT));
		menu.add(new Dish("French Fries", true, 530, DishType.OTHER));
		menu.add(new Dish("Rice", true, 350, DishType.OTHER));
		menu.add(new Dish("Fruit Salad", true, 120, DishType.OTHER));
		menu.add(new Dish("Pizza", true, 550, DishType.OTHER));
		menu.add(new Dish("Prawns", false, 300, DishType.FISH));
		menu.add(new Dish("Salmon", false, 450, DishType.FISH));
		
		
//		menu.stream()
//		        .filter(dish -> dish.isVegeterian())
//		        .forEach(dish -> System.out.println(dish));
//		
//	  menu.stream()
//	          .filter(Dish::isVegeterian)
//	          .forEach(System.out::println);
	        
		List<String> names = Arrays.asList("Anna", "Jason", "George", "King", "Bryan");
		
//		names.stream()
//		         .map(name -> name.length())
//		         .forEach(len -> System.out.println(len));

//		names.stream()
//		         .map(String::length)
//		         .forEach(System.out::println);
		
	
		List<String> brands = Arrays.asList("Giant", "Scott", "Trek", "GT");
		
//		List<BiCycle> bicycles = brands.stream()
//													  .map(brandName -> new BiCycle(brandName))
//													  .collect(Collectors.toList());
		
		List<BiCycle> bicycles = brands.stream()
				  									  .map(BiCycle::new)
				                                      .collect(Collectors.toList());
		
		bicycles.forEach(System.out::println);
	}
}




















