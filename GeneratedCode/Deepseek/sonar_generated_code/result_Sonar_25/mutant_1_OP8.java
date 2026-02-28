import java.lang.reflect.Field;

class Main {
    record Person(String name, int age) {}

    public static void main(String[] args) throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true); // secondary
        field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields
    }

    public static String showBug() throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person, "B"); // Noncompliant
        return person.name();
    }

    public static String showMutant() throws Exception {
        Person mutantPerson = new Person("A", 26);
        Field mutantField = Person.class.getDeclaredField("name");
        mutantField.setAccessible(true);
        mutantField.set(mutantPerson, "B"); // Mutant
        return mutantPerson.name();
    }
}