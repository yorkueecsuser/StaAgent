import org.junit.Test;
import static org.junit.Assert.*;

public class StringBufferBugExampleTest {

    @Test
    public void testShowBugWithEmptyStringBuffer() {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer();
        assertFalse(example.showBug(sb)); // TRIGGER BUG: UseStringBufferLength
    }

    @Test
    public void testShowBugWithNonEmptyStringBuffer() {
        StringBufferBugExample example = new StringBufferBugExample();
        StringBuffer sb = new StringBuffer("test");
        assertTrue(!example.showBug(sb)); // TRIGGER BUG: UseStringBufferLength
    }
}