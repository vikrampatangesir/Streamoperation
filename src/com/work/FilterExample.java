package com.work;
import java.util.stream.Stream;

public class FilterExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 // Creating a stream of strings
        Stream<String> stream = Stream.of("Geeks", "foR", "GeEksQuiz", "GeeksforGeeks");
  
        // Getting a stream consisting of the
        // elements ending with 's'
        // using Stream filter(Predicate predicate)
        stream.filter(str -> str.endsWith("s")).forEach(System.out::println);
        
        

	}

}
