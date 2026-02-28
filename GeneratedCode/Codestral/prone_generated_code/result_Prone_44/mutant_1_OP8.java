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
        return person.name.equals(this.name);
    }

    public static void showBug() {
        Set<Person> persons = new HashSet<>();

        Person a = new Person("John");
        Person b = new Person("John");

        persons.add(a);
        persons.add(b);

        System.out.println("Number of unique persons: " + persons.size());
    }

    public static void main(String[] args) {
        showBug();
    }
}