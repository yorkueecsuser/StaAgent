import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void testEquals() {
        Person person1 = new Person(new String[]{"John", "Doe"}, 30);
        Person person2 = new Person(new String[]{"Jane", "Doe"}, 30);
        assertFalse(person1.equals(person2)); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }

    @Test
    public void testHashCode() {
        Person person1 = new Person(new String[]{"John", "Doe"}, 30);
        Person person2 = new Person(new String[]{"Jane", "Doe"}, 30);
        assertNotEquals(person1.hashCode(), person2.hashCode()); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }

    @Test
    public void testToString() {
        Person person1 = new Person(new String[]{"John", "Doe"}, 30);
        Person person2 = new Person(new String[]{"Jane", "Doe"}, 30);
        assertNotEquals(person1.toString(), person2.toString()); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }
}