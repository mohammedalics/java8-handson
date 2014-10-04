package home.handson.java8.lambda;

import java.util.concurrent.Callable;

/**
 * Example of functional interfaces with Lambda
 * 
 *
 */
public class HelloCallable {

   public static void main(String[] args) {
      try {
    	  // Java8
         Callable<String> c = () -> "Hello from Callable";

           // Java7
//         Callable<String> c = new Callable<String>() {
//			
//			@Override
//			public String call() throws Exception {
//				
//				return "Hello from Callable";
//			}
//		};
         System.out.println(c.call());
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
   }
}