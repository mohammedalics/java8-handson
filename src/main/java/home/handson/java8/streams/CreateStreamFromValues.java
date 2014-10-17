package home.handson.java8.streams;

import java.util.stream.Stream;

public class CreateStreamFromValues {
	
	public static void main (String[] args) {
		// of() creaes a stream from varied length parameters
		Stream<String> stream = Stream.of("Mohammed Ali", "Software Engineer");
		stream.forEach(System.out::println);
		
		
		// of() creates a stream from a single value 
		stream = Stream.of("Mohammed Ali");
		stream.forEach(System.out::println);
		
	}

}
