import org.junit.Test;
import static org.junit.Assert.*;

public class BufferOverrunExampleTest {

    @Test
    public void testShowBugWithValidIndex() {
        BufferOverrunExample ex = new BufferOverrunExample();
        assertEquals(5, ex.showBug(5));
    }

    @Test
    public void testShowBugWithInvalidIndex() {
        BufferOverrunExample ex = new BufferOverrunExample();
        ex.showBug(15); // TRIGGER BUG: BUFFER_OVERRUN_L3​
    }
}