import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderBugExampleTest {

    @Test
    public void testShowBug() {
        StringBuilderBugExample example = new StringBuilderBugExample();
        String result = example.showBug('A'); // TRIGGER BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        assertEquals("A was intended as initial value", result);
    }

    @Test
    public void testShowBugWithStringBuffer() {
        StringBuilderBugExample example = new StringBuilderBugExample();
        String result = example.showBugWithStringBuffer('B'); // TRIGGER BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        assertEquals("B was intended as initial value", result);
    }
}