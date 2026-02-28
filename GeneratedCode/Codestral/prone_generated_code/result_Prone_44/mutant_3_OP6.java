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

        // Mutant: Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This code should never execute");
        }

        return person.name.equals(this.name);
    }

    // hashCode not overridden - this causes the bug

    private static boolean getCondition() {
        return false;  // Dynamically determined condition for the unreachable loop
    }

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