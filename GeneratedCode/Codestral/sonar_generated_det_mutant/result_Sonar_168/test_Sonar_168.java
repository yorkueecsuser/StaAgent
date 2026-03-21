import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    public void testShowBug() {
        BuggyClass buggyObject1 = new BuggyClass("test");
        BuggyClass buggyObject2 = new BuggyClass("test");

        // The bug is triggered here because even though the equals() method is overridden,
        // the hashCode() method is not. This violates the contract between equals() and hashCode()
        // as stated in the Java Language Specification.
        // TRIGGER BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
        buggyObject1.showBug(buggyObject2);

        // If the objects are equal as per equals() method, their hashCodes should also be equal.
        // However, in this case, they are not equal which triggers the bug.
        assertEquals("Hashcodes are not equal even though objects are equal.", buggyObject1.hashCode(), buggyObject2.hashCode());
    }
}