package com.work;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,21);
		   
		   Optional result  = numbers.stream().min(Integer::compareTo);
		   
		   if(result.isPresent())
		   {
			   System.out.println(result);
			   
		   }
		   
		   Integer results2=numbers.stream().reduce(0 ,(a,b)->a<b?a:b );
		   
		   Optional result2 = numbers.stream().reduce((a,b) -> a<b?a:b);
	        if(result2.isPresent())
	            System.out.println(result2.get());
	        
	        Optional result3 = numbers.stream().reduce(Integer::min);
	        if(result3.isPresent())
	            System.out.println(result3.get());

	        
	        
	       
	}

}
