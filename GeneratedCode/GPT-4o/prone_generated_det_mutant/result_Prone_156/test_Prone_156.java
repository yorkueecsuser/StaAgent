import org.junit.Test;
import static org.junit.Assert.*;

public class StringBuilderInitWithCharDemoTest {

    @Test
    public void testShowBugWithCharA() {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        String result = demo.showBug('A'); // TRIGGER BUG: StringBuilderInitWithChar
        // The expected result should be "A is the initial size, not the character."
        // But due to the bug, the initial capacity is set to 65, and "A" is not included.
        assertEquals("A is the initial size, not the character.", result);
    }

    @Test
    public void testShowBugWithCharZ() {
        StringBuilderInitWithCharDemo demo = new StringBuilderInitWithCharDemo();
        String result = demo.showBug('Z'); // TRIGGER BUG: StringBuilderInitWithChar
        // The expected result should be "Z is the initial size, not the character."
        // But due to the bug, the initial capacity is set to 90, and "Z" is not included.
        assertEquals("Z is the initial size, not the character.", result);
    }
}