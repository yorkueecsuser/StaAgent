import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderBugExampleTest {

    @Test
    public void testShowBug() {
        StringBuilderBugExample example = new StringBuilderBugExample();
        String result = example.showBug(); // TRIGGER BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        assertEquals("StringBuilder capacity: 65, StringBuffer capacity: 65", result);
    }
}