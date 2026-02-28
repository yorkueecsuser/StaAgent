import java.util.*;

class SuspiciousEqualsMethodName {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Jane", "Doe");
        System.out.println(p1.equals(p2)); // BUG: SuspiciousEqualsMethodName
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

// Mutant 1: Renaming variable "firstName" to "fn"
class Person {
    private String fn;
    private String lastName;

    public Person(String fn, String lastName) {
        this.fn = fn;
        this.lastName = lastName;
    }

    public boolean equals(Person person) {
        return this.fn.equals(person.fn) && this.lastName.equals(person.lastName);
    }
}

// Mutant 2: Renaming variable "lastName" to "ln"
class Person {
    private String firstName;
    private String ln;

    public Person(String firstName, String ln) {
        this.firstName = firstName;
        this.ln = ln;
    }

    public boolean equals(Person person) {
        return this.firstName.equals(person.firstName) && this.ln.equals(person.ln);
    }
}