import org.junit.Test;
import static org.junit.Assert.*;

public class StringToStringExampleTest {

    @Test
    public void testShowBug() {
        StringToStringExample example = new StringToStringExample();
        String result = example.showBug("Hello"); // TRIGGER BUG: StringToString
        // The test will fail because the method unnecessarily calls toString() on a String
        assertEquals("Hello", result);
    }

    @Test
    public void testShowBugWithEmptyString() {
        StringToStringExample example = new StringToStringExample();
        String result = example.showBug(""); // TRIGGER BUG: StringToString
        // The test will fail because the method unnecessarily calls toString() on a String
        assertEquals("", result);
    }
}