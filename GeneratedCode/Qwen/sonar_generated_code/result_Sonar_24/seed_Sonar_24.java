import java.util.Arrays;
import java.util.Objects;

record Person(String[] names, int age) { // BUG: Equals method should be overridden in records containing array fields
    public static void main(String[] args) {
        Person person1 = new Person(new String[]{"Alice", "Bob"}, 30);
        Person person2 = new Person(new String[]{"Alice", "Bob"}, 30);
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // This will print false due to the bug
    }

    public boolean showBug(String[] names1, String[] names2, int age) {
        Person person1 = new Person(names1, age);
        Person person2 = new Person(names2, age);
        return person1.equals(person2); // This will return false due to the bug
    }
}