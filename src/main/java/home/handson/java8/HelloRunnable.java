package home.handson.java8;

import java.lang.Runnable;

public class HelloRunnable {

   public static void main(String args[]) {
	   // Java 8
      new Thread(() -> {
         System.out.println("Hello from a thread");
      }).start();
      
      
      // Java 7
      new Thread(new Runnable() {
		
		@Override
		public void run() {
			   System.out.println("Hello from a thread");
			
		}
	});
   }
}