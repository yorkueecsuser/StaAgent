import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        StringBuilder sb = new StringBuilder('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        StringBuffer sbf = new StringBuffer('A'); // BUG: "StringBuilder" and "StringBuffer" should not be instantiated with a character
        assertEquals(5, sb.capacity()); // Expected: 5 Actual: 65
        assertEquals(5, sbf.capacity()); // Expected: 5 Actual: 65
    }
}