import java.lang.reflect.Field;

class Main {
    record Person(String name, int age) {}

    public static void main(String[] args) throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true); // secondary
        field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields

        // Mutation begins - Unreachable Switch Statement
        boolean unreachable = getUnreachableCondition();
        switch (unreachable) {
            case false: 
                // Unreachable code
                break;
        }
        // Mutation ends
    }

    public static String showBug() throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person, "B"); // Noncompliant

        // Mutation begins - Unreachable Switch Statement
        boolean unreachable = getUnreachableCondition();
        switch (unreachable) {
            case false: 
                // Unreachable code
                break;
        }
        // Mutation ends

        return person.name();
    }

    // Helper method to ensure that the condition of the switch statement is dynamically determined at runtime.
    private static boolean getUnreachableCondition() {
        return false;
    }
}