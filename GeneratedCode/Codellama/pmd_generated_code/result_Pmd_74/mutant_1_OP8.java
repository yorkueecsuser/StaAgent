import java.util.*;

class SuspiciousEqualsMethodName {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Jane", "Doe");
        System.out.println(p1.equals(p2)); // BUG: SuspiciousEqualsMethodName

        // Mutant 1: Renamed variable "p1" to "person1"
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Doe");
        System.out.println(person1.equals(person2)); // BUG: SuspiciousEqualsMethodName

        // Mutant 2: Renamed variable "p2" to "person2"
        Person p1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Doe");
        System.out.println(p1.equals(person2)); // BUG: SuspiciousEqualsMethodName

        // Mutant 3: Renamed both variables "p1" and "p2" to "person1" and "person2" respectively
        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Doe");
        System.out.println(person1.equals(person2)); // BUG: SuspiciousEqualsMethodName
    }
}

class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Person person) {
        return this.firstName.equals(person.firstName) && this.lastName.equals(person.lastName);
    }
}