import java.util.Arrays;
import java.util.Objects;

record Person(String[] names, int age) { // BUG: Equals method should be overridden in records containing array fields
    public void showBug(String[] names1, String[] names2, int age1, int age2) {
        Person person1 = new Person(names1, age1);
        Person person2 = new Person(names2, age2);
        System.out.println("person1.equals(person2): " + person1.equals(person2));
        System.out.println("person1.hashCode(): " + person1.hashCode());
        System.out.println("person2.hashCode(): " + person2.hashCode());
        System.out.println("person1.toString(): " + person1.toString());
        System.out.println("person2.toString(): " + person2.toString());
    }
}