package io.javabrains.exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


/*
 * Sorting list of persons wrt last name
 * printing the new sorted list
 * printing persons first name beginning with C
 * All in Java 7 style 
 * */
public class Unit1ExerciseJava7Way {

	public static void main(String[] args) {

		
		List<Person> people = Arrays.asList(
			new Person("Charles", "Dickens", 60),
			new Person("Lewis", "Caroll", 42),
			new Person("Thomas", "Carlyle", 51),
			new Person("Charolette", "Bronte", 45),
			new Person("Mathew", "Arnold", 39)
		);		
		
//		Step 1: Sort list by last name
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
		}
			}
				);
		
//		Step 2: Create a method that prints all the elements in the list
		printAll(people);
		printPersonWithLastNameC(people);
		
//		Step 3: Create a method that prints all names that have last name starting with C, passing the condition as well	
		System.out.println("Printing names conditionally, last name starting with C");
		printNameConditionally(people, new Condition(){
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("C");
			}
			
		}
		);
	}
	
//	Step 3: Create a method that prints all names that have last name starting with C
	public static void printPersonWithLastNameC(List<Person> people) {
		for (Person person : people) {
			if (person.lastName.startsWith("C")) {
				System.out.println(person);
			}
		}
	}
	
	public static void printAll(List<Person> people){
		for (Person person : people) {
			System.out.println(person);
		}
	}
	
//	Step 3: Create a method that prints all names that have last name starting with C, passing the condition as well
	public static void printNameConditionally(List<Person> people, Condition c) {
		for(Person p : people ){
			if(c.test(p)){
				System.out.println(p);
			}
		}
	}
	
interface Condition{
	boolean test(Person p);
}




}