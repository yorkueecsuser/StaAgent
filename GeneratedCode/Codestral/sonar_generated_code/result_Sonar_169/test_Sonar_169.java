import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsMethodBugTest {

    @Test
    public void testEqualsMethodBug() {
        EqualsMethodBug obj1 = new EqualsMethodBug(5);
        EqualsMethodBug obj2 = new EqualsMethodBug(5);

        // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
        // The bug is triggered here because EqualsMethodBug.equals(Object) is not overridden correctly
        obj1.showBug(obj2);  // This line should execute without ClassCastException
    }
}