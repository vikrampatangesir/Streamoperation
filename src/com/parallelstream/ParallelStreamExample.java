package com.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamExample 
{

	public static void main(String[] args) 
	{
		  System.out.println("Sum Sequential: " + sumSequentialStream());
	        System.out.println("Sum Parallel: " + sumParallelStream());
		  
		
		
		
	}
	 public static int sumSequentialStream()
	 {
	        return IntStream.rangeClosed(0,3).sum();
	   }
	 
	 public static int sumParallelStream(){
	        return IntStream.rangeClosed(0,3).parallel().sum();
	    }
	 
	 

}
