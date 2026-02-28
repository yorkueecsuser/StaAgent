import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testShowBug() {
        Person person = new Person("A", 26);
        Field field = Person.class.getDeclaredField("name");
        field.setAccessible(true); // secondary
        field.set(person, "B"); // BUG: Reflection should not be used to increase accessibility of records' fields

        try {
            person.showBug();
            fail("Expected IllegalAccessException to be thrown");
        } catch (IllegalAccessException e) {
            // Expected exception
        }
    }
}