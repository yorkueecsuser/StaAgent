import java.lang.reflect.Field;
import java.util.Random;

class ReflectionBug {
    record Person(String name, int age) {}

    public String showBug() {
        int deadStoreVariable = new Random().nextInt(100); // Dead store variable mutation
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