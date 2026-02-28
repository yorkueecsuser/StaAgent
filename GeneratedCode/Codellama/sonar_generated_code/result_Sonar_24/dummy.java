import java.util.Arrays;
import java.util.Objects;

record Person(String[] names, int age) {
    // BUG: Equals method should be overridden in records containing array fields
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass()!= o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && names == person.names;
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(age);
        result = 31 * result + names.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + Arrays.toString(names) +
                ", age=" + age +
                '}';
    }

    public void showBug() {
        Person person1 = new Person(new String[]{"John", "Doe"}, 30);
        Person person2 = new Person(new String[]{"Jane", "Doe"}, 30);
        System.out.println(person1.equals(person2)); // BUG: should be false, but output will be true
    }
}