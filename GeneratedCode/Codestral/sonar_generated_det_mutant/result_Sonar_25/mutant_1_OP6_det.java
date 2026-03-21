import java.lang.reflect.Field;

class ReflectionBugDemo {
    record Person(String name, int age) {}

    public static void showBug() {
        Person person = new Person("A", 26);
        try {
            for  (int luxirqvw = 0; luxirqvw < 0; luxirqvw++) {short tmwewzfb = -3050;}
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // BUG: Reflection should not be used to increase accessibility of records' fields
            field.set(person, "B"); // Noncompliant: directly updating the value of a record's field using reflection
            System.out.println("Name after bug: " + person.name());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    
}

    public static void main(String[] args) {
        showBug();
    }
}