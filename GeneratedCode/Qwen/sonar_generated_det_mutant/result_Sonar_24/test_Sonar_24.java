import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testPersonEqualityWithArrayField() {
        String[] names1 = {"Alice", "Bob"};
        String[] names2 = {"Alice", "Bob"};
        int age1 = 30;
        int age2 = 30;

        Person person1 = new Person(names1, age1);
        Person person2 = new Person(names2, age2);

        assertFalse(person1.equals(person2)); // TRIGGER BUG: Equals method should be overridden in records containing array fields
        assertNotEquals(person1.hashCode(), person2.hashCode()); // TRIGGER BUG: Equals method should be overridden in records containing array fields
        assertEquals(person1.toString(), person2.toString()); // TRIGGER BUG: Equals method should be overridden in records containing array fields

        person1.showBug(names1, names2, age1, age2); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }
}