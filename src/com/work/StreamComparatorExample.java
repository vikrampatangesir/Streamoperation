package com.work;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.Instructors.Instructor;
import com.Instructors.Instructors;

public class StreamComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * List<String> list = Arrays.asList("Geeks", "for", "GeeksforGeeks",
		 * "GeeksQuiz", "GFG");
		 * 
		 * list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		 */
		 //retuning all instructors sorted by their name
	        List<Instructor> list = Instructors.getAll().stream()
	                            .sorted(Comparator.comparing(Instructor::getName).reversed())
	                            .collect(Collectors.toList());
	        list.forEach(System.out::println);


	       
		 
		 

	}

}
