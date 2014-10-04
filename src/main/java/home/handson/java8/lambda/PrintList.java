package home.handson.java8.lambda;

import java.util.ArrayList;
import java.util.List;

public class PrintList {
	
	public static void main (String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Mohammed"); 
		list.add("Ali");
		list.add("HP");
		// Java 7
		for (String s : list) {
		     System.out.println(s);
		 }
		 //Java 8
		 list.forEach(System.out::println);
	}

}
