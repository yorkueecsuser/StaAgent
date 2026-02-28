import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyClassTest {

    @Test
    // TRIGGER BUG: "equals(Object obj)" and "hashCode()" should be overridden in pairs
    public void testShowBug() {
        BuggyClass buggyClass = new BuggyClass();
        assertTrue(buggyClass.showBug()); // This should fail because the equals method is overridden but the hashCode method is not
    }
}