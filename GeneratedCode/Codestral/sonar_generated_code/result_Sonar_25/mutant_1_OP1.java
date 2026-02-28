import java.lang.reflect.Field;
import java.util.UUID;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        int unusedVariable = 10; // Dead Store: Inserting unused variable declaration
        Person person = new Person("A", 26);
        try {
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true);
            field.set(person, "B");
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
        return person.name();
    }
}