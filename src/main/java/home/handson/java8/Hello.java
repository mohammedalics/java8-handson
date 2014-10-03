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
//class HelloServiceImpl implements HelloService {
//	@Override
//	public String sayHello(String firstName, String lastName) {
//		return "Hello " + firstName + " " + lastName + "!";
//
//	}
//}

/**
 * The Class Hello.
 */
public class Hello {
	
	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		HelloService helloService = (firstName, lastName) -> {
			return "Hello " + firstName + " " + lastName + "!";
		};
		
//		HelloService helloService = new HelloServiceImpl();
		System.out.println(helloService.sayHello(args[0], args[1]));

	}
}