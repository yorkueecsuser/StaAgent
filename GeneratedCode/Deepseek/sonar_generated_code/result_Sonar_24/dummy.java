import java.util.Arrays;
import java.util.Objects;

// BUG: Equals method should be overridden in records containing array fields
record Person(String[] names, int age) {

    public boolean showBug() {
        Person p1 = new Person(new String[]{"John", "Doe"}, 30);
        Person p2 = new Person(new String[]{"John", "Doe"}, 30);
        Person p3 = new Person(new String[]{"Jane", "Doe"}, 30);

        // Bug: Equals method is not overridden, hence it is using reference equality
        return p1.equals(p2); // This should return true, but returns false due to lack of equals method
    }

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