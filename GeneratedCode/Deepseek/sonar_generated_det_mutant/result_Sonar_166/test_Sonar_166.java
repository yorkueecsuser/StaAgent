import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {
    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        assertEquals("This is a bug", buggyCode.showBug());  // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
    }

    @Test
    public void testShowBug1() {
        BuggyCode buggyCode = new BuggyCode();
        assertEquals(12345, buggyCode.showBug1());  // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
    }

    @Test
    public void testShowBug2() {
        BuggyCode buggyCode = new BuggyCode();
        Object obj = new Object();
        assertEquals(obj == buggyCode, buggyCode.showBug2(obj));  // TRIGGER BUG: Methods should not be named "tostring", "hashcode" or "equal"
    }
}