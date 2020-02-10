package io.javabrains.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
	
//		Step 1: Sort list by last name
//		Step 2: Create a method that prints all the elements in the list
//		Step 3: Create a method that prints all names that have last name starting with C
}