import org.junit.Test;
import static org.junit.Assert.*;

public class StringAppendingExampleTest {

    @Test
    public void testShowBugWithSmallIterations() {
        StringAppendingExample example = new StringAppendingExample();
        String result = example.showBug(5); // TRIGGER BUG: UseStringBufferForStringAppends
        assertEquals("String0String1String2String3String4", result);
    }

    @Test
    public void testShowBugWithLargeIterations() {
        StringAppendingExample example = new StringAppendingExample();
        String result = example.showBug(100); // TRIGGER BUG: UseStringBufferForStringAppends
        assertEquals(generateExpectedString(100), result);
    }

    private String generateExpectedString(int iterations) {
        StringBuilder expected = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            expected.append("String").append(i);
        }
        return expected.toString();
    }
}