package home.handson.java8.streams;

import java.util.stream.Stream;

public class EmptyStream {

	public static void main(String[] args) {
		/**
		 * We can use empty() static method from Stream interface to create an
		 * empty sequential stream.
		 */
		Stream<String> stream = Stream.empty();
		stream.forEach(System.out::println);
	}
}
