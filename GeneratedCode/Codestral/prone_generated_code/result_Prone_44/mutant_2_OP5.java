import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        boolean alwaysFalse = getCondition(); // Added method call to generate dynamic condition

        switch(alwaysFalse? 1 : 2) { // Unreachable switch statement
            case 1:
                System.out.println("This should never execute");
                break;
            default:
                break;
        }

        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;
        return person.name.equals(this.name);
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the switch statement unreachable
    }

    // hashCode not overridden - this causes the bug

    public static void showBug() {
        Set<Person> persons = new HashSet<>();

        Person person1 = new Person("John");
        Person person2 = new Person("John");

        persons.add(person1);
        persons.add(person2);

        System.out.println("Number of unique persons: " + persons.size()); // Expected to print 1, but prints 2 due to the bug
    }

    public static void main(String[] args) {
        showBug();
    }
}