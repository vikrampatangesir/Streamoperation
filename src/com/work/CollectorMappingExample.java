package com.work;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.Instructors.Instructor;
import com.Instructors.Instructors;

public class CollectorMappingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		  //Instructors by their years of experience
        Map<Integer, List<String>> mapYearsOfExperienceAndNames = Instructors.getAll().stream()
                .collect(Collectors.groupingBy(Instructor::getYearsOfExperience,
                        Collectors.mapping(Instructor::getName, Collectors.toList())));

        mapYearsOfExperienceAndNames.forEach((key,value) ->
        {
            System.out.println("key = " + key + " value = " + value);
        });

	}

}
