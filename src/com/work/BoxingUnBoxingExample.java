package com.work;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  IntStream numStream = IntStream.rangeClosed(0,5000); //primitive int stream
		  List<Integer>  numbers = numStream.boxed().collect(Collectors.toList());
	       numbers.forEach(System.out::println);
	       
	       
	       Optional<Integer> sum=numbers.stream().reduce((a, b)->a + b);
	       
	       if(sum.isPresent())
	       {
	    	   
	    	   System.out.println (sum.get());
	    	   
	       }
	       
	       
	       

	}

}
