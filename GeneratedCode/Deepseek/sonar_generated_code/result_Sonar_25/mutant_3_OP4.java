import java.lang.reflect.Field;

class Main {
    record Person(String name, int age) {}

    public static void main(String[] args) throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true); // secondary
        field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields

        // Mutant Code
        if (false) { // Unreachable if-else statement
            System.out.println("This code is unreachable.");
        }
    }

    public static String showBug() throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person, "B"); // Noncompliant

        // Mutant Code
        if (false) { // Unreachable if-else statement
            System.out.println("This code is unreachable.");
        }

        return person.name();
    }
}