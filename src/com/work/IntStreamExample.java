package com.work;

import java.util.Random;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static void main(String[] args) {

		
		IntStream numbers=   IntStream.of(1,2,3,4,5);
		numbers.forEach(System.out::println);
		
		System.out.println("-----------");
		numbers=IntStream.iterate(0, i->i +2).limit(5);
		numbers.forEach(System.out::println);
		System.out.println("-----------");
		
		numbers=IntStream.generate(new Random()::nextInt).limit(5);
		numbers.forEach(System.out::println);
		
		System.out.println("-----------");
		
		   numbers = IntStream.range(1,5);
	        numbers.forEach(System.out::println);

	        System.out.println("-----------");

	}

}
