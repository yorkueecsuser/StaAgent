import java.util.Arrays;
import java.util.Objects;

class Main {
    public static void main(String[] args) {
        // Call the showBug method
        showBug();
    }

    public static void showBug() {
        // Creating two person objects with same values
        Person person1 = new Person(new String[]{"John", "Doe"}, 30);
        Person person2 = new Person(new String[]{"John", "Doe"}, 30);

        // Comparing the two objects using equals method
        // This will return false as equals method is not overridden in the Person record
        if (person1.equals(person2)) {
            System.out.println("The two person objects are equal");
        } else {
            System.out.println("BUG: Equals method should be overridden in records containing array fields"); // BUG: Equals method should be overridden in records containing array fields
        }
    }
}

record Person(String[] names, int age) {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Arrays.equals(names, person.names);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(age);
        result = 31 * result + Arrays.hashCode(names);
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", age=" + age +
                '}';
    }
}