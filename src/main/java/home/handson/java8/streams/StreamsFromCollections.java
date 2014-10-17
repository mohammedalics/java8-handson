package home.handson.java8.streams;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class StreamsFromCollections {

	public static void main(String[] args) {
		Set<String> names = new HashSet();
		names.add("XML");
		names.add("Java");

		Stream<String> sequentialStream = names.stream();
		sequentialStream.forEach(System.out::println);

		Stream<String> parallelStream = names.parallelStream();
		parallelStream.forEach(System.out::println);
	}
}
