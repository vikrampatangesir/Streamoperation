package com.work;

import java.util.Arrays;
import java.util.Optional;

import com.Instructors.Instructors;

public class StreamReduceExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 //printing the instructor who has the highest years of experience
        Optional instructor = Instructors.getAll().stream().reduce((s1,s2)-> s2.getYearsOfExperience()
                >s1.getYearsOfExperience()?s2:s1);
if(instructor.isPresent())
    System.out.println(instructor.get());


//String array
String[] array = { "Geeks", "for", "Geeks" };

// The result of the reduce() method is
// an Optional because the list on which
// reduce() is called may be empty.
Optional<String> String_combine = Arrays.stream(array).reduce((str1, str2)-> str1 + "-" + str2);

// Displaying the combined String
if (String_combine.isPresent())
{
    System.out.println(String_combine.get());
}
}

        	
        	
        }




