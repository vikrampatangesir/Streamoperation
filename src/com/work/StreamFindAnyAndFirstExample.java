package com.work;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.Instructors.Instructor;
import com.Instructors.Instructors;

public class StreamFindAnyAndFirstExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Optional<Instructor> instructorOptional = Instructors.getAll().stream()
	                .findAny();
		  
		  if(instructorOptional.isPresent())
		  {
			  System.out.println(instructorOptional.get());
		  }
		  

	        instructorOptional = Instructors.getAll().stream().findFirst();
	        if (instructorOptional.isPresent())
	            System.out.println(instructorOptional.get());
	        
	        List<String> list = Arrays.asList("A", "B", "C", "D");

	        Optional<String> result = list.stream().findAny();
	        
	        if(result.isPresent())
			  {
				  System.out.println(result.get());
			  }
	        
	        


	}

}
