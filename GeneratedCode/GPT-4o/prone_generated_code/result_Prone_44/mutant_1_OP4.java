import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person person = (Person) obj;

        if (age != person.age) return false;
        return name != null ? name.equals(person.name) : person.name == null;
    }

    // BUG: EqualsHashCode
    // Missing hashCode method which can lead to inconsistent behavior in hash-based collections

    // Added unreachable if-else branch
    private boolean getUnreachableCondition() {
        return false; // This makes the condition always false, thus unreachable.
    }

    public static void showBug() {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        Set<Person> people = new HashSet<>();
        people.add(person1);

        // Unreachable if-else statement
        boolean unreachableCondition = new Person("", 0).getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This branch is unreachable.");
        } else {
            // Original code path
            System.out.println("Does set contain person2? " + people.contains(person2));
        }
    }

    public static void main(String[] args) {
        showBug();
    }
}