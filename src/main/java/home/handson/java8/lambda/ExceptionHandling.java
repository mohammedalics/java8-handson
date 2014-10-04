package home.handson.java8.lambda;


interface IService {
	void method() throws Exception;
}

public class ExceptionHandling {
	// If the lambda throw an exception, the functional interface should throws the same exceptions. 
	public static void main(String[] args) {
		IService service = () -> {
			throw new Exception(); 
			
		};
		
		// Compilation error should occur if you call a method from 'service' without handling the exception. 

		try {
			service.method();
		} catch (Exception e) {
			e.printStackTrace();
		}
			
	}
	

}
