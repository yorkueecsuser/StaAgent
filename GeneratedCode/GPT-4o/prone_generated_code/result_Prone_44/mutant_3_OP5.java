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

        // Mutation Operator: Unreachable switch statement
        int unreachable = getUnreachableValue(); // This method is assumed to return a non-final value
        switch (unreachable) {
            case 9999: // Assuming getUnreachableValue never returns 9999
                System.out.println("This code is unreachable");
                break;
            default:
                // Default case to maintain switch statement structure
                break;
        }
    }

    private static int getUnreachableValue() {
        return 0; // Assuming this value never changes to 9999
    }

    public static void main(String[] args) {
        showBug();
    }
}