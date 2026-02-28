import org.junit.Test;
import static org.junit.Assert.*;

public class StringBufferBugExampleTest {

    @Test
    public void testShowBug() {
        StringBufferBugExample example = new StringBufferBugExample();
        assertTrue(example.showBug()); // TRIGGER BUG: UseStringBufferLength
    }

    @Test
    public void testShowBug2() {
        StringBufferBugExample example = new StringBufferBugExample();
        assertTrue(example.showBug2()); // TRIGGER BUG: UseStringBufferLength
    }
}