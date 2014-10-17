package home.handson.java8.streams;

import java.util.stream.IntStream;

public class CreateIntStreamFromRange {

	public static void main(String[] args) {
		IntStream oneToFive = IntStream.range(1, 6);
		// IntStream oneToFive = IntStream.rangeClosed(1, 5);
		oneToFive.forEach(System.out::println);
	}

}
