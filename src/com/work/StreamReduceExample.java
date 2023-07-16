package com.work;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers=Arrays.asList(1,2,3,4,5,6,7,8,9);
		
	    int results =numbers.stream().reduce(0, (a, b)-> a +b );
	    
	    System.out.println(results);
		
	    
	    Optional result2 = numbers.stream().reduce((a, b) -> a + b);
        System.out.println("--------");
        if(result2.isPresent())
            System.out.println(result2.get());


		

	}

}
