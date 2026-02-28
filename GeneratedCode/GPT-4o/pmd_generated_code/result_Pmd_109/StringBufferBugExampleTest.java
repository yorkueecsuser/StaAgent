import org.junit.Test;
import static org.junit.Assert.*;

public class StringBufferBugExampleTest {

    @Test
    public void testShowBug() {
        StringBufferBugExample example = new StringBufferBugExample();
        String result = example.showBug(); // TRIGGER BUG: InefficientStringBuffering

        // This test should fail, showcasing the inefficiency of the method due to the bug.
        // To trigger a failure, we'll assert an incorrect expected value.
        assertEquals("tmp = ", result); // Expecting a failure since the actual result is not equal to this string
    }
}