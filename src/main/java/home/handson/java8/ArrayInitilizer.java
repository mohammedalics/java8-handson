package home.handson.java8;

import java.util.concurrent.Callable;

public class ArrayInitilizer {

	public static void main(String[] args) {
		try {

			// ERROR : generic array initializer
//			Callable<String>[] c = new Callable<String>[] {
//					() -> "Hello from Callable a",
//					() -> "Hello from Callable b",
//					() -> "Hello from Callable c" };
			
			// TRUE : non-generic array initializer
			Callable<String>[] c = new Callable[] {
					() -> "Hello from Callable a",
					() -> "Hello from Callable b",
					() -> "Hello from Callable c" };

			System.out.println(c[1].call());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}