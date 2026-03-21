import org.junit.Test;
import static org.junit.Assert.*;

public class StringBufferLengthBugTest {
    @Test
    public void testShowBug() {
        StringBuffer sb = new StringBuffer("test");
        StringBufferLengthBug bugInstance = new StringBufferLengthBug();
        assertFalse("Should not return true for non-empty StringBuffer", bugInstance.showBug(sb)); // TRIGGER BUG: UseStringBufferLength

        sb.setLength(0);
        assertTrue("Should return true for empty StringBuffer", bugInstance.showBug(sb)); // TRIGGER BUG: UseStringBufferLength
    }
}