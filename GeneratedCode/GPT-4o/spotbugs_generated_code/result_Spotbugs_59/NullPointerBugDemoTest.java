import org.junit.Test;
import static org.junit.Assert.*;

public class NullPointerBugDemoTest {

    @Test
    public void testShowBugWithShortInput() {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        demo.showBug("test"); // TRIGGER BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }

    @Test
    public void testShowBugWithExactFiveLengthInput() {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        demo.showBug("12345"); // TRIGGER BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
    }

    // This test will not trigger the bug because the input length is greater than 5
    @Test
    public void testShowBugWithLongInput() {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        String result = demo.showBug("123456");
        assertEquals("Long enough", result);
    }
}