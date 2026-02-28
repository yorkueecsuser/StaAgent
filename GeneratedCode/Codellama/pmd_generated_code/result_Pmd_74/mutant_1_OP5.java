import java.util.*;

class SuspiciousEqualsMethodName {
    public static void main(String[] args) {
        Person p1 = new Person("John", "Doe");
        Person p2 = new Person("Jane", "Doe");
        System.out.println(p1.equals(p2)); // BUG: SuspiciousEqualsMethodName

        // Mutated code: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition) {
            case false:
                System.out.println("This code is unreachable");
                break;
            default:
                System.out.println("This code is reachable");
                break;
        }
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

    // Mutated code: Unreachable switch statement
    public boolean getCondition() {
        return false;
    }
}