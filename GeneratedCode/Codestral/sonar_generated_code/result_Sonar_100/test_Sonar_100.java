import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testBuggyMethod() {
        BuggyClass buggyClass = new BuggyClass("notNull");
        String result = buggyClass.buggyMethod(); // TRIGGER BUG: "@NonNull" values should not be set to null
        assertNotNull(result); // This assertion will fail because buggyMethod() returns null
    }

    @Test
    public void testShowBug() {
        BuggyClass buggyClass = new BuggyClass(null);
        String result = buggyClass.showBug(); // TRIGGER BUG: "@NonNull" values should not be set to null
        assertNotNull(result); // This assertion will fail because showBug() internally sets nonNullField to null and then returns null
    }
}