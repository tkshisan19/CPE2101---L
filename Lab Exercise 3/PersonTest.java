package LE31_Person;

public class PersonTest {

	public static void main(String[] args) {
		PersonClass p1 = new PersonClass("John", 20);
		PersonClass p2 = new PersonClass("John", 20);
		PersonClass p3 = new PersonClass("John", 25);
		PersonClass p4 = new PersonClass("Mary", 20);

        System.out.println("Test isEqual:");
        System.out.println("p1 == p2 (expected true): " + p1.isEqual(p2));
        System.out.println("p1 == p3 (expected false): " + p1.isEqual(p3));

        System.out.println("\nTest hasSameName:");
        System.out.println("p1 & p2 (expected true): " + p1.hasSameName(p2));
        System.out.println("p1 & p4 (expected false): " + p1.hasSameName(p4));

        System.out.println("\nTest hasSameAge:");
        System.out.println("p1 & p2 (expected true): " + p1.hasSameAge(p2));
        System.out.println("p1 & p3 (expected false): " + p1.hasSameAge(p3));

        System.out.println("\nTest isOlder:");
        System.out.println("p3 older than p1 (expected true): " + p3.isOlder(p1));
        System.out.println("p1 older than p4 (expected false): " + p1.isOlder(p4));

        System.out.println("\nTest isYounger:");
        System.out.println("p1 younger than p3 (expected true): " + p1.isYounger(p3));
        System.out.println("p3 younger than p1 (expected false): " + p3.isYounger(p1));
	}

}
