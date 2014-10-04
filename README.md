Java 8 hands on
===============

**Lambda Expression**

 - short form replacement for anonymous classes. 
 - simplifying the implementation of functional interfaces. 
 - functional interfaces: Interfaces with only one method declaration. 
 - functional interfaces were implementing using 
	 - A class that implements this interface. 
	 - anonymous class for that interface. 
 - lambda expression is designed to support multicore processor architecture (don’t know how).   

**benefits of Lambda** 

 - concise implementation 
 - Method references and constructor references. 
 - Reduced runtime overhead compared to anonymous classes

**Syntax**

> (formal parameter list) -> { expression or statements }

 - A lambda expression has an implicit target type associated with it because an interface type is not explicitly specified.
 - The target type of a lambda conversion must be a functional interface.
 - Lambda expressions can be used only in contexts in which the target type can be inferred. Such contexts are:
	 - A variable declaration
	 - An assignment
	 - A return statement
	 - An array initializer
	 - Method or constructor arguments
	 - A lambda expression body
	 - A ternary conditional expression
	 - A cast expression
 - A lambda expression body must not throw more exceptions than specified in the throws clause of the functional interface method. If a lambda expression body throws an exception, the throws clause of the functional interface method must declare the same exception type or its supertype.

**Examples in order**

 4. Hello
 5. HelloCallable
 5. HelloRunnable
 6. LambdaWithVariables 
 7. ArrayInitializer
 8. FunctionalInterfaceWithArrayAsParameter 
 9. LambdaInGUI
 10. ConditionalExpression
 11. SameLambdaDifferentType
 12. InnerLambda
 13. ExceptionHandling
 14. Ambiguity
 15. Inferring
 16. This
 17. MethodReference
 18. ConstructorReference
 19. VirtualExtensionMethods


----------
**Useful Links**
https://leanpub.com/whatsnewinjava8/read#leanpub-auto-preface
http://www.oracle.com/technetwork/articles/java/lambda-1984522.html 
http://baddotrobot.com/blog/2014/02/18/method-references-in-java8/
http://docs.oracle.com/javase/tutorial/java/javaOO/methodreferences.html
http://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html
