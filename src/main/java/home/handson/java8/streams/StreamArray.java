package home.handson.java8.streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamArray {

	public static void main(String[] args) {
		Stream<String> names = Arrays.stream(new String[] { "XML", "Java" });
		names.forEach(System.out::println);
		
		IntStream numbers = Arrays.stream(new int[]{1, 2, 3});
		numbers.forEach(System.out::println);

	}

}
