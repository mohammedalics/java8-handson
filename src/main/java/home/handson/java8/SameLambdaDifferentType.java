package home.handson.java8;


interface Interface1 {
	void method1(); 
}

interface Interface2 {
	void method1(); 
}

public class SameLambdaDifferentType {

	public static void main(String[] args) {
		Interface1 interface1 = () -> {};
		Interface2 interface2 = () -> {}; 
	}
}
