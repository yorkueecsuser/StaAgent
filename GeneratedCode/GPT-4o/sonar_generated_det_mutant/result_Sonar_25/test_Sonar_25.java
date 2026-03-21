import org.junit.Test;
import java.lang.reflect.Field;

public class ReflectionAccessibilityBugDemoTest {

    public record Person(String name, int age) {}

    public void showBug() {
        try {
            Person person = new Person("A", 26);
            Field field = Person.class.getDeclaredField("name");
            field.setAccessible(true); // BUG: Reflection should not be used to increase accessibility of records' fields
            field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testShowBug() {
        ReflectionAccessibilityBugDemoTest demo = new ReflectionAccessibilityBugDemoTest();
        demo.showBug(); // TRIGGER BUG: Reflection should not be used to increase accessibility of records' fields
    }
}