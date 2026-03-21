import org.junit.Test;
import static org.junit.Assert.*;

public class RegexStackOverflowExampleTest {

    @Test
    public void testShowBugWithLargeInput() {
        RegexStackOverflowExample example = new RegexStackOverflowExample();
        String largeInput = "a".repeat(7000);
        // TRIGGER BUG: Regular expressions should not overflow the stack
        boolean result = example.showBug(largeInput); // This is expected to fail due to stack overflow
        assertFalse(result);
    }
}