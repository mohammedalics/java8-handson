package home.handson.java8.streams;

import java.util.stream.Stream;

public class StreamGenerate {

	/**
	 * generate(Supplier<T> s) uses Supplier to generate an infinite sequential
	 * unordered stream.
	 */

	public static void main(String[] args) {
		Stream.generate(Math::random).limit(5).forEach(System.out::println);
	}

}
