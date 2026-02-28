import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsMethodBugTest {

    @Test
    public void testEqualsMethod() {
        EqualsMethodBug obj1 = new EqualsMethodBug(1, "Test");
        EqualsMethodBug obj2 = new EqualsMethodBug(1, "Test");

        assertEquals(true, obj1.equals((Object) obj2)); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }

    @Test
    public void testShowBugMethod() {
        EqualsMethodBug example = new EqualsMethodBug(1, "Example");
        example.showBug(); // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
    }
}