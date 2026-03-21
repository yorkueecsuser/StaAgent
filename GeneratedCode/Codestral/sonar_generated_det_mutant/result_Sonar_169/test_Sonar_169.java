import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyEqualsMethodTest {

    @Test
    public void testEqualsMethodBug() {
        BuggyEqualsMethod obj1 = new BuggyEqualsMethod("Bug");
        BuggyEqualsMethod obj2 = new BuggyEqualsMethod("Bug");

        // TRIGGER BUG: "equals" method overrides should accept "Object" parameters
        obj1.showBug(obj2); // This will not compile because equals expects Object and not String
    }
}