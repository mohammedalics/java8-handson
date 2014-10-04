package home.handson.java8.lambda;

interface InterfaceA {
	public void method1 (); 
	default public void method2() {
		System.out.println("Hello Default Implementation");
	}
}
public class VirtualExtensionMethods {
	
	public static void main (String[] args) {
		InterfaceA a1 = new InterfaceA() {
			
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				
			}
		};
		
		a1.method2();
	}

}
