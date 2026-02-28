import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyCodeTest {

    @Test
    public void testCheckNull() {
        BuggyCode buggyCode = new BuggyCode();
        assertFalse(buggyCode.checkNull()); // TRIGGER BUG: ComparingThisWithNull
    }

    @Test
    public void testCheckNotNull() {
        BuggyCode buggyCode = new BuggyCode();
        assertTrue(buggyCode.checkNotNull()); // TRIGGER BUG: ComparingThisWithNull
    }

    @Test
    public void testShowBug() {
        BuggyCode buggyCode = new BuggyCode();
        boolean[] results = buggyCode.showBug();
        assertFalse(results[0]); // TRIGGER BUG: ComparingThisWithNull
        assertTrue(results[1]); // TRIGGER BUG: ComparingThisWithNull
    }
}