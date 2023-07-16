package com.work;

import com.Instructors.Instructor;
import com.Instructors.Instructors;

public class StreamMapFilterReduceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   //total years of experience b/w instructors
        int result = Instructors.getAll().stream()
                .filter(Instructor::isOnlineCourses)
                .map(Instructor::getYearsOfExperience)
                .reduce(0,Integer::sum);

        System.out.println(result);

	}

}
