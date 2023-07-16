package com.work;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamAggregateExample {

	public static void main(String[] args) {

		
		int sum =IntStream.rangeClosed(0,9).sum();
		System.out.println("sum of 1000 numbers is: " + sum);
		
		  OptionalInt min = IntStream.rangeClosed(0,1000).min();
	        if (min.isPresent())
	        {
	         System.out.println("Minimum of 1000 numbers is: " + min.getAsInt());
	         
	        }
		
		
	}

}
