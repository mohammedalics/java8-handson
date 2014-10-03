package home.handson.java8;

/**
 * Hello Lambda!
 *
 */

/**
 * 
 * The interface HelloService
 *
 */

interface HelloService {
	String sayHello(String firstName, String lastName);
}

/**
 * The Class HelloServiceImpl.
 */
// class HelloServiceImpl implements HelloService {
// @Override
// public String sayHello(String firstName, String lastName) {
// return "Hello " + firstName + " " + lastName + "!";
//
// }
// }

/**
 * The Class Hello.
 */
public class Hello {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String[] args) {

		// java8
		// Parameter type String for firstName and lastName is optional.
		// Curly braces are optional because it's only one statement.
		HelloService helloService = (firstName, lastName) -> {
			return "Hello " + firstName + " " + lastName + "!";
		};
				

		// Java7
		// HelloService helloService = new HelloServiceImpl();
		System.out.println(helloService.sayHello(args[0], args[1]));

	}
}