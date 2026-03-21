import org.junit.Test;
import static org.junit.Assert.*;

public class BugUseStringBufferLengthTest {
    @Test
    // TRIGGER BUG: UseStringBufferLength
    public void testShowBug() {
        BugUseStringBufferLength bug = new BugUseStringBufferLength();
        StringBuffer sb = new StringBuffer();
        sb.append("Some String");

        // TRIGGER BUG: UseStringBufferLength
        assertEquals("StringBuffer is not empty", bug.showBug());
    }
}