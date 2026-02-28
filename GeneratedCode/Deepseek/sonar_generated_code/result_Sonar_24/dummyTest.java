import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testEquals() {
        Person person1 = new Person(new String[]{"John", "Doe"}, 30);
        Person person2 = new Person(new String[]{"John", "Doe"}, 30);
        Person person3 = new Person(new String[]{"Jane", "Doe"}, 30);

        // TRIGGER BUG: Equals method should be overridden in records containing array fields
        assertTrue(person1.showBug()); // This line triggers the bug
        assertFalse(person1.equals(person3));
    }
}