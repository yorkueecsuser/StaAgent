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
        
        // Introducing an unreachable switch statement
        int unreachableValue = getUnreachableValue(); // Dynamic non-final value
        switch (unreachableValue) { // The switch will never match any case
            case 1:
                System.out.println("This should never be executed.");
                break;
            case 2:
                System.out.println("Nor should this.");
                break;
        }
    }

    // Method to dynamically determine the unreachable value, always returning a non-matching value
    private static int getUnreachableValue() {
        return 0; // Return value that does not match any case above
    }

    public static void main(String[] args) {
        showBug();
    }
}