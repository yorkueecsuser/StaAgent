import java.lang.reflect.Field;

class Main {
    record Person(String name, int age) {}

    public static void main(String[] args) throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true); // secondary
        field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields
        int a = 2; // unreachable code
        switch(a) { case 1: a++; case 2: a++; } // Mutant code
    }

    public static String showBug() throws Exception {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true);
        field.set(person, "B"); // Noncompliant
        boolean shouldRun = getCondition(); // new variable to avoid compile-time constants
        if (!shouldRun) { // use! operator to avoid compile-time constant false
            return ""; // noncompliant - unreachable code
        }
        return person.name();
    }
}