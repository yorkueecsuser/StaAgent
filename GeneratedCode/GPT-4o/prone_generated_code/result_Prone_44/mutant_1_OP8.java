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
    }

    public static void main(String[] args) {
        showBug();
    }
}

// Mutant: Rename a variable in the Person class.
class PersonMutant {
    private String x; // Renamed from 'name' to 'x'
    private int age;

    public PersonMutant(String x, int age) { // Updated constructor parameter
        this.x = x; // Updated assignment
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PersonMutant person = (PersonMutant) obj;

        if (age != person.age) return false;
        return x != null ? x.equals(person.x) : person.x == null; // Updated comparison
    }

    // BUG: EqualsHashCode
    // Missing hashCode method which can lead to inconsistent behavior in hash-based collections

    public static void showBug() {
        PersonMutant person1 = new PersonMutant("Alice", 30);
        PersonMutant person2 = new PersonMutant("Alice", 30);

        Set<PersonMutant> people = new HashSet<>();
        people.add(person1);

        System.out.println("Does set contain person2? " + people.contains(person2));
    }

    public static void main(String[] args) {
        showBug();
    }
}