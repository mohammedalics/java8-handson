package home.handson.java8;

import java.util.concurrent.Callable;


public class ConditionalExpression {

   public static void main(String[] args) {
      try {

         boolean flag = true;
         Callable<String> c = flag ? (() -> "Hello from Callable: flag true")
               : (() -> "Hello from Callable: flag false");

         System.out.println(c.call());
      } catch (Exception e) {
         System.err.println(e.getMessage());
      }
   }
}