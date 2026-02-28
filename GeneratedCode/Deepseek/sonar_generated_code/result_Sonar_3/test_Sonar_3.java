import org.junit.Test;
import static org.junit.Assert.*;

public class StringIndexOutOfBoundsBugTest {
    StringIndexOutOfBoundsBug bug = new StringIndexOutOfBoundsBug();

    @Test
    public void testNegativeBeginIndex() {
        assertEquals("Error: String index out of range: -1", bug.showBug("test", -1, 2));
        // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    }

    @Test
    public void testReverseIndexes() {
        assertEquals("Error: String index out of range: 3", bug.showBug("test", 4, 2));
        // TRIGGER BUG: "String.indexOf" should be used with correct ranges
    }
}