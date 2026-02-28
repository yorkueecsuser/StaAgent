import java.lang.reflect.Field;

class Main {
    record Person(String name, int age) {}

    public static void main(String[] args) throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true); // secondary
        field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields
        int unreachableValue = 1;
        boolean isUnreachable = false;
        switch (unreachableValue) {
            case 0:
                isUnreachable = true;
                break;
            case 1: // Unreachable switch case
                isUnreachable = false;
                break;
        }
    }

    public static String showBug() throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person, "B"); // Noncompliant
        int unreachableValue = 1;
        boolean isUnreachable = false;
        switch (unreachableValue) {
            case 0:
                isUnreachable = true;
                break;
            case 1: // Unreachable switch case
                isUnreachable = false;
                break;
        }
        return person.name();
    }
}