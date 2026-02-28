import java.lang.reflect.Field;

class ReflectionAccessibilityBugDemo {

    // Record definition
    record Person(String name, int age) {}

    public String showBug(String initialName, int age, String newName) {
        try {
            // Creating an instance of the record
            Person person = new Person(initialName, age);

            // Accessing the 'name' field using reflection
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // BUG: Reflection should not be used to increase accessibility of records' fields
            field.set(person, newName); // BUG: Reflection should not be used to increase accessibility of records' fields

            return person.name();
        } catch (Exception e) {
            return e.getClass().getName() + ": " + e.getMessage();
        }
    }

    public static void main(String[] args) {
        ReflectionAccessibilityBugDemo demo = new ReflectionAccessibilityBugDemo();
        System.out.println(demo.showBug("Alice", 30, "Bob"));
    }
}