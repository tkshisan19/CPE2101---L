package LE31_Person;

import java.util.Scanner;

public class PersonMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//PERSON 1
		System.out.println("Enter name (Person 1): ");
		String name1 = scanner.nextLine();
		System.out.println("Enter age (Person 1): ");
		int age1 = scanner.nextInt();
		scanner.nextLine();
		
		
		//PERSON 2
		System.out.println("Enter name (Person 2): ");
		String name2 = scanner.nextLine();
		System.out.println("Enter age (Person 2): ");
		int age2 = scanner.nextInt();
		
		PersonClass p1 = new PersonClass(name1, age1);
		PersonClass p2 = new PersonClass(name2, age2);
		
		System.out.println("\nPerson 1: " + p1.displayPerson());
        System.out.println("Person 2: " + p2.displayPerson());

        System.out.println("\nComparisons:");
        System.out.println("Are they equal? " + p1.isEqual(p2));
        System.out.println("Same name? " + p1.hasSameName(p2));
        System.out.println("Same age? " + p1.hasSameAge(p2));
        System.out.println("Is Person 1 older? " + p1.isOlder(p2));
        System.out.println("Is Person 1 younger? " + p1.isYounger(p2));

        scanner.close();
	}

}
