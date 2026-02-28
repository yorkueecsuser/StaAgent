import java.lang.reflect.Field;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        Person person = new Person("A", 26);
        boolean unreachableCondition = false;
        while(unreachableCondition) { // Unreachable while loop
            System.out.println("This is an unreachable code block.");
        }
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // Noncompliant: Bug - Reflection should not be used to increase accessibility of records' fields
            field.set(person, "B"); // Noncompliant: Bug - Reflection should not be used to increase accessibility of records' fields
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return person.name();
    }
}