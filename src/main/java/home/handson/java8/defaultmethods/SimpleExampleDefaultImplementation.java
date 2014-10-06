package home.handson.java8.defaultmethods;


interface A {
    default void foo(){
       System.out.println("Calling A.foo()");
    }
}
 
class Clazz implements A {
}


public class SimpleExampleDefaultImplementation {

	public static void main (String[] args)
	{
		new Clazz().foo();
	}
}
