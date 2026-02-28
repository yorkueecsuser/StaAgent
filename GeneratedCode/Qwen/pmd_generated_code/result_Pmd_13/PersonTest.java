import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testShowBug() {
        Person p = new Person("John Doe");
        assertEquals("John Doe", p.showBug()); // TRIGGER BUG: AvoidFieldNameMatchingTypeName
    }
}