/**
 * 
 */
package io.javabrains;

/** @author ajayrabidas | Nov 30, 2019 **/

public class HelloWorldGreeting implements Greeting {

	@Override
	public void perform() {
		System.out.println("Hellow World from HellowWorldGreeting class");
	}

}
