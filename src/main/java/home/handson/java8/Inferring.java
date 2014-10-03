package home.handson.java8;

import java.util.concurrent.Callable;

public class Inferring {

   static String hello(Runnable r) {
      return "Hello from Runnable";
   }

   static String hello(Callable c) {
      return "Hello from Callable";
   }

   public static void main(String[] args) {

      String hello = hello(() -> "Hello Lambda");
      System.out.println(hello);

   }
}