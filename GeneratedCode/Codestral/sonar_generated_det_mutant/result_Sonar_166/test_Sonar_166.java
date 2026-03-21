import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testToStringOverride() {
        BuggyClass buggyObject = new BuggyClass("BuggyName");
        // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
        assertFalse(buggyObject.toString().equals(buggyObject.tostring()));
    }
}