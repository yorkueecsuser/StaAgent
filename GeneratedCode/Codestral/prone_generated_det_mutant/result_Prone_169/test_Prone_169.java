import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryCheckNotNullBugTest {
    @Test
    public void testShowBugWithNonNullInput() {
        UnnecessaryCheckNotNullBug buggyClass = new UnnecessaryCheckNotNullBug();
        String input = "Hello, World!";
        String result = buggyClass.showBug(input); // TRIGGER BUG: UnnecessaryCheckNotNull
        assertEquals("HELLO, WORLD!", result);
    }

    @Test
    public void testShowBugWithNullInput() {
        UnnecessaryCheckNotNullBug buggyClass = new UnnecessaryCheckNotNullBug();
        String input = null;
        String result = buggyClass.showBug(input); // TRIGGER BUG: UnnecessaryCheckNotNull
        assertNull(result); // This line should fail because the buggy method should never return null
    }
}