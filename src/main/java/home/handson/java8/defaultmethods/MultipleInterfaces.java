package home.handson.java8.defaultmethods;

 interface A1 {
    default void foo(){
       System.out.println("Calling A.foo()");
    }
}
 
 interface B1 {
    default void foo(){
       System.out.println("Calling B.foo()");
    }
}

 
 /**
  * Clazz1 can't implement two interfaces have two default methods with the same signature. 
  * complication error occur 
  * @author mohammedali
  *
  */
class Clazz1 implements A1, B1 {
	public void foo() {
		A1.super.foo();
	}
	
}