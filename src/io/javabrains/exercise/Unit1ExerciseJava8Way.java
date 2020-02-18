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
public class Unit1ExerciseJava8Way {

	public static void main(String[] args) {

		
		List<Person> people = Arrays.asList(
			new Person("Charles", "Dickens", 60),
			new Person("Lewis", "Caroll", 42),
			new Person("Thomas", "Carlyle", 51),
			new Person("Charolette", "Bronte", 45),
			new Person("Mathew", "Arnold", 39)
		);		
		
/*		
//		Step 1: Sort list by last name
		Collections.sort(people, new Comparator<Person>(){
			@Override
			public int compare(Person o1, Person o2) {
				System.out.println(this); // can be used here since it is in the not in main but in different context
				return o1.getLastName().compareTo(o2.getLastName());
		}
			}
				);
*/		
		
//		Java 8 Way
		Comparator<Person> lambdaCompare = (Person p1 , Person p2) -> p1.getLastName().compareTo(p2.getLastName());
		Collections.sort(people, lambdaCompare);
		
//		Step 2: Create a method that prints all the elements in the list
		System.out.println("using lambda expression");
		printAll(people);
	
//		Step 3: Create a method that prints all names that have last name starting with C
		System.out.println("with last name starting with C");
		printPersonWithLastNameC(people);
		
		Collections.sort(people, (Person p1 , Person p2) -> p1.getLastName().compareTo(p2.getLastName()));
		
		System.out.println("Based on name");
		people.forEach(p-> System.out.println(p));
		
		
		
//		sort based on age
		Collections.sort(people, (Person p1 , Person p2) -> {
//			System.out.println(this); // cannot be used here since it is in the main context
			if(p1.getAge() < p2.getAge() ){
				return -1;
			}else if(p1.getAge() == p2.getAge()){
				return 0;
			} return 1;
		});
		System.out.println("Based on age");
		people.forEach(p-> System.out.println(p));
	
	
	} //main ends here
	
		
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

}