package home.handson.java8.lambda;

public class LambdaWithVariables {
	
	public static void main (String[] args) {
		int x = 2; // the same as final.  
		HelloService helloService = (firstName, lastName) -> {
			// can't re-assign x
			// curly brackets of lambda is not scope. the outer scope is the scope of lambda.  
			// x = 3; 
			return "Hello " + firstName + " " + lastName + "!";
		};
				
		System.out.println(helloService.sayHello(args[0], args[1]));
	}

}
