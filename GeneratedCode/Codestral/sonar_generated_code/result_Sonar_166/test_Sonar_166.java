import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {
    @Test
    // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
    public void testToStringBug() {
        BuggyClass buggyClass = new BuggyClass("BuggyName");
        assertEquals("BuggyClass[name=BuggyName]", buggyClass.tostring()); // This will fail as the tostring method is not correctly named.
    }
}