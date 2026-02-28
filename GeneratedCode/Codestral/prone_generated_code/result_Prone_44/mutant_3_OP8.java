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

        Person p = (Person) obj; // Mutant code: Renaming 'person' variable to 'p'
        return p.name.equals(this.name);
    }

    public static void showBug() {
        Set<Person> persons = new HashSet<>();

        Person person1 = new Person("John");
        Person prsn2 = new Person("John"); // Mutant code: Renaming 'person2' variable to 'prsn2'

        persons.add(person1);
        persons.add(prsn2);

        System.out.println("Number of unique persons: " + persons.size());
    }

    public static void main(String[] args) {
        showBug();
    }
}