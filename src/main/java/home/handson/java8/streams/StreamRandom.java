package home.handson.java8.streams;

import java.util.Random;

public class StreamRandom {

	/**
	 * java.util.Random class provides ints(), longs(), and doubles() return
	 * infinite IntStream, LongStream, and DoubleStream, respectively.
	 */

	public static void main(String[] args) {
		new Random().ints().limit(5).forEach(System.out::println);
	}

}
