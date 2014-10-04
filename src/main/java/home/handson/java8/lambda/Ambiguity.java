package home.handson.java8.lambda;

// TODO: Auto-generated Javadoc
interface Amb1 {
	public String method();
}

interface Amb2 {
	public String method();
}

class MyClass {
	public void method(Amb1 amb1) {

	}

	public void method(Amb2 amb2) {

	}

}

/**
 * The Class Ambiguity.
 */
public class Ambiguity {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		myClass.method((Amb1) () -> "Hello");
	}

}
