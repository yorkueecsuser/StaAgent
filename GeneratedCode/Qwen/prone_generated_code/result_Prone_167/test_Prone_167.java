import org.junit.Test;
import static org.junit.Assert.*;

public class UnicodeDirectionalityBugTest {

    @Test
    public void testShowBug() {
        UnicodeDirectionalityBug bugDemo = new UnicodeDirectionalityBug();
        String result = bugDemo.showBug(); // TRIGGER BUG: UnicodeDirectionalityCharacters
        assertEquals("Expected string does not match", "alert\u202E(xss)\u202C", result);
    }
}