package home.handson.java8.lambda;

import java.util.concurrent.Callable;

public class InnerLambda {

	public static void main(String[] args) {
		try {

			Callable<Runnable> c = () -> () -> {
				System.out.println("Hello from Callable");
			};
			c.call().run();

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
