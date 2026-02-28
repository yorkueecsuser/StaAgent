import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderBugTest {
    @Test
    public void testShowBug() {
        StringBuilderBug bugInstance = new StringBuilderBug();
        assertEquals("A", bugInstance.showBug()); // TRIGGER BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
    }
}