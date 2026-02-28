import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testEqualsWithArrayField() {
        String[] names1 = {"Alice", "Bob"};
        String[] names2 = {"Alice", "Bob"};
        int age = 30;
        assertFalse(person.showBug(names1, names2, age)); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }

    @Test
    public void testEqualsWithDifferentArrayField() {
        String[] names1 = {"Alice", "Bob"};
        String[] names2 = {"Charlie", "David"};
        int age = 30;
        assertFalse(person.showBug(names1, names2, age)); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }

    @Test
    public void testEqualsWithSameReferenceArrayField() {
        String[] names = {"Alice", "Bob"};
        int age = 30;
        assertTrue(person.showBug(names, names, age)); // TRIGGER BUG: Equals method should be overridden in records containing array fields
    }

    private final Person person = new Person(new String[]{"Alice", "Bob"}, 30);
}