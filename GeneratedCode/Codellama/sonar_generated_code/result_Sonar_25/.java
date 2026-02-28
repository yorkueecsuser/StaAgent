import java.lang.reflect.*;

record Person(String name, int age) {}

Person person = new Person("A", 26);
Field field = Person.class.getDeclaredField("name");
field.setAccessible(true); // secondary
field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields

public static void showBug() {
  Person person = new Person("A", 26);
  Field field = Person.class.getDeclaredField("name");
  field.setAccessible(true);
  field.set(person, "B");
  System.out.println(person.name); // Output: B
}