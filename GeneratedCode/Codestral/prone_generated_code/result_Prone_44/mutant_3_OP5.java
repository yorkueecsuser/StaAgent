import java.util.HashSet;
import java.util.Set;

class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (!(obj instanceof Person)) {
            return false;
        }

        Person person = (Person) obj;

        // Inserting unreachable switch statement
        int value = alwaysReturnsNegativeOne();
        switch(value) {
            case 1:
                System.out.println("This line will never be executed.");
                break;
        }

        return person.name.equals(this.name);
    }

    // Method that always returns -1
    private int alwaysReturnsNegativeOne() {
        return -1;
    }

    // hashCode not overridden

    public static void showBug() {
        Set<Person> persons = new HashSet<>();

        Person person1 = new Person("John");
        Person person2 = new Person("John");

        persons.add(person1);
        persons.add(person2);

        System.out.println("Number of unique persons: " + persons.size());
    }

    public static void main(String[] args) {
        showBug();
    }
}