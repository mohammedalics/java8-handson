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

		
		/**
		 * FILTER ======= Stream<T> filter() uses a Predicate<T> to keep
		 * elements if the specified Predicate returns true for that element.
		 * 
		 * The following statement obtains a stream of only odd integers:
		 * 
		 * Stream<Integer> oddNumbersStream= numbersStream.filter(n ->n % 2 ==
		 * 1);
		 * 
		 * MAP ======= Stream<T> map() uses a Function to map each element in the
		 * stream and create a new stream.
		 * 
		 * The following statement maps a stream to their squares:
		 * 
		 * Stream<Integer> aStream = stream.map(n -> n * n);
		 * 
		 * 
		 */
		
		
		/**
		 * REDUCE ======= reduce(T identity, BinaryOperator<T> accumulator) reduces the stream
		 * to a single value.
		 * 
		 * It takes an initial value and an accumulator that is a
		 * BinaryOperator<T> as arguments.
		 * 
		 * reduce(T identity, BinaryOperator<T> accumulator) performs a
		 * reduction on the elements of this stream, using the provided initial
		 * value and an associative accumulation function, and returns the
		 * reduced value.
		 * 
		 * This is equivalent to:
		 * 
		 * 
		 * T result = identity; 
		 * for (T element : this stream) result =
		 * accumulator.apply(result, element) return result; 
		 * The following code sums all integers in the stream.
		 * 
		 * int sum = aStream.reduce(0, (n1, n2) -> n1 + n2); 
		 * The Integer.sum() method performs sum of two integers.
		 * 
		 * We can rewrite the code using a method reference.
		 * 
		 * int sum = aStream.reduce(0, Integer::sum);
		 */
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
