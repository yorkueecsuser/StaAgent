import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) { // BUG: EqualsHashCode
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;
        boolean isEqual = person.name.equals(this.name);

        // Unreachable switch statement
        boolean shouldNotExecute = getFalseCondition();
        switch(shouldNotExecute? 1 : 0) {
            case 1:
                System.out.println("This line should never execute.");
                break;
        }

        return isEqual;
    }

    private boolean getFalseCondition() {
        return false;
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