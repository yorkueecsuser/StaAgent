import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testShowBugWithDefaultConstructor() {
        BuggyClass buggyObject = new BuggyClass();
        assertEquals("Default constructor", buggyObject.showBug());
    }

    @Test
    public void testShowBugWithParamConstructor() {
        BuggyClass buggyObject = new BuggyClass("Test message"); // TRIGGER BUG: MoreThanOneInjectableConstructor
        assertEquals("Test message", buggyObject.showBug());
    }
}