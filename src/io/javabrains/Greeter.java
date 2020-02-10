/**
 * 
 */
package io.javabrains;

import org.omg.Messaging.SyncScopeHelper;

/** @author ajayrabidas | Nov 30, 2019 **/

public class Greeter {

/*	private void greet() {
		System.out.println("Hello World");
	}
	
	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		greeter.greet();
	}*/

//	Performing passing object which has a state
	private void greet(Greeting greeting) {
		greeting.perform();
	}
	
	public static void main(String[] args) {
		/*HelloWorldGreeting hwg = new HelloWorldGreeting();
//		hwg.perform();
		
		Greeter greeter = new Greeter();
		greeter.greet(hwg);*/
		
		//using and instance
//		Greeting helloWorldGreeting = new HelloWorldGreeting();	
//		helloWorldGreeting.perform();
		
		//using lambda expression
		Greeting myLambdaFunction = () -> System.out.println("Hello world from lambda expression"); 
//		myLambdaFunction.perform();
		
		//using anonymous inner class
		Greeting innerClass = new Greeting() {
			@Override
			public void perform() {
				System.out.println("Hello World from anonymous innner class");				
			}
		};
		
//		innerClass.perform();
		
		//Similarly, a method accepting the greeting interface, should accept the other implementations
		Greeter greeter = new Greeter();
		greeter.greet(myLambdaFunction); // can also be writtern in type inference form as >>
		greeter.greet( () -> System.out.println("Hello from type inference") );
		
		greeter.greet(innerClass);
		
		
		
	}
	
//	performing using lambda expression
	
	MyLambda myLambdaFunction = () -> System.out.println("Hello World from Lambda Expression"); //2
	MyAdd myAddFunction = (int a, int b) -> a + b;	//3
	
	// Similarly, we can use Greeting Interface for a lambda expression
	Greeting myGreeting = () -> System.out.println("Hello World from lambda expression");
}

interface MyLambda{	//2
	void foo();
}

interface MyAdd{	//3
	int add(int x, int y);
}
