package com.work;

import java.util.Set;
import java.util.stream.Collectors;

import com.Instructors.Instructor;
import com.Instructors.Instructors;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   //return only instructor names from the instructor list
        Set<String> instructorNames = Instructors.getAll().stream()
                                        .map(Instructor::getName)
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toSet());
        System.out.println(instructorNames);

	}

}
