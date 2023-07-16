package com.work;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.Instructors.Instructor;
import com.Instructors.Instructors;

public class JoiningExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String result=Stream.of("E","F", "G", "H").collect(Collectors.joining());
		 
		 System.out.println(result);
		 
		 
		   result = Stream.of ("E", "F", "G", "H").collect(Collectors.joining(",","{" ,"}"));
	       System.out.println(result);
	        
	       //instructors names seperated by ' and prefix { and suffix }
	        String namesConcatenated = Instructors.getAll().stream()
	                            .map(Instructor::getName)
	                            .collect(Collectors.joining(",","{", "}"));
	        
	        
	        System.out.println("namesConcatenated = " + namesConcatenated);
	        
		 

	}

}
