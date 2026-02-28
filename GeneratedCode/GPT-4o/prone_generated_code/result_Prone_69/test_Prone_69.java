import org.junit.Test;
import static org.junit.Assert.*;

public class MutablePersonTest {

    @Test
    public void testShowBug() {
        MutablePerson person = new MutablePerson("John");
        assertEquals("John", person.getName().toString());
        
        // This line will trigger the bug because the internal state of the MutablePerson is modified
        person.showBug(" Doe"); // TRIGGER BUG: Immutable

        // Expectation is that the name remains "John", but due to the bug, it will be "John Doe"
        assertEquals("John", person.getName().toString()); // TRIGGER BUG: Immutable
    }
}