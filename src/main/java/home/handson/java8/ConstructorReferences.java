package home.handson.java8;

import java.util.ArrayList;
import java.util.List;


// TODO: Auto-generated Javadoc
interface Inter1 {
	public List<String> method (); 
}

class C1 {
	public void method (Inter1 inter1) {
		
	}
}

/**
 * The Class ConstructorReferences.
 */
public class ConstructorReferences {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new C1().method(ArrayList<String>::new);
	}
}
