package home.handson.java8.streams;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		// Java 7: External Iteration 
		int sum = 0;
		for (int n : numbers) {
			if (n % 2 == 1) {
				int square = n * n;
				sum = sum + square;
			}
		}
		System.out.println("Java 7, External Ineration: " + sum);

		// Java 8: Sequential Internal Itegration 
		sum = numbers.stream().filter(n -> n % 2 == 1).map(n -> n * n)
				.reduce(0, Integer::sum);
		System.out
				.println("Java 8, Internal Iteration, Sequential computation: "
						+ sum);
	
		// Java 8: Parallel Internal Itegration 
		sum = numbers.parallelStream().filter(n -> n % 2 == 1).map(n -> n * n)
				.reduce(0, Integer::sum);
		System.out
				.println("Java 8, Internal Iteration, Parallel   computation: "
						+ sum);
	}

}
