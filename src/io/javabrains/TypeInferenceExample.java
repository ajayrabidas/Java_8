/**
 * 
 */
package io.javabrains;

/** @author ajayrabidas | Nov 30, 2019 **/

public class TypeInferenceExample {
	
	public static void main(String[] args) {
		
//		StringLengthLambda myLambda = (String s) -> s.length(); //can be written as
//		StringLengthLambda myLambda = s -> s.length();
//		System.out.println(myLambda.getLength("Helloooo") );
		
		printLambda( s -> s.length());	//2
	}
	
	// same thing using type inference is
	private static void printLambda(StringLengthLambda l) {	//2
		System.out.println(	l.getLength("Helloooooo") );
	}

	interface StringLengthLambda{
		int getLength(String s );
	}
	
}
