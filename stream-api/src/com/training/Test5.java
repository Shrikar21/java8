package com.training;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test5 {
	
	public static void main(String[] args) {
	
		// map() method => one to one mapping  => Accepts one input and returns one output
		
		// List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		
		//List<Integer> squares = numbers.stream()
		//												.map(n -> n * n)
		//												.collect(Collectors.toList());
		
		// System.out.println(squares);
		
		List<List<Integer>> numbers = new ArrayList<List<Integer>>();
		
		numbers.add(Arrays.asList(1, 2));
		numbers.add(Arrays.asList(3, 4));
		numbers.add(Arrays.asList(5, 6));
		numbers.add(Arrays.asList(7,8));
		
		List<Integer> result = numbers.stream()
													  .flatMap(list -> list.stream())
													  .collect(Collectors.toList());
		             
		  System.out.println("Result => " + result);           
		
		// flatMap() method => one to many mapping (It flattens a stream) => Accepts one input and returns zero or more outputs.
		// flatMap() method flattens multiple streams into single stream.
		
		String words [] = { "Hello", "World" };
		
		// Return list of characters which are unique in words.  Expected output =>  [ "H", "e", "l", "o", "W", "r", "d" ]
		
		Stream<String> stream = Arrays.stream(words);
		
//		List<String[]> result = stream.map(s -> s.split(""))
//		          								   .distinct()
//		          								   .collect(Collectors.toList());
		         
//		result.forEach(arr -> {
//			for(String s: arr) 
//				System.out.print(s);
//		});

		List<String> uniqueCharacters = stream.map(s -> s.split(""))        //  ["H", "e", "l", "l", "o"]     ["W", "o", "r", "l", "d"]
													       .flatMap(arr -> Arrays.stream(arr))   // 1. Stream<String>   => "H", "e", "l", "o" ,"W",  "r",  "d"
													       .distinct()
													       .collect(Collectors.toList());
		          
		System.out.println(uniqueCharacters);           
			
	}
}












