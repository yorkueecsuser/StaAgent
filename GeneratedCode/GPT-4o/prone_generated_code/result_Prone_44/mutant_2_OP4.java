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

    public static void showBug() {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);

        Set<Person> people = new HashSet<>();
        people.add(person1);

        System.out.println("Does set contain person2? " + people.contains(person2));

        // Mutant: Unreachable if-else statement
        boolean isUnreachable = getUnreachableCondition();
        if (isUnreachable) {
            System.out.println("This will never be printed");
        } else {
            System.out.println("This is the always reachable else branch");
        }
    }

    // Method to ensure the condition is not a compile-time constant
    private static boolean getUnreachableCondition() {
        return false; // This determines the unreachable condition dynamically
    }

    public static void main(String[] args) {
        showBug();
    }
}