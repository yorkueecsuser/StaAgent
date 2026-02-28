import org.junit.Test;
import static org.junit.Assert.*;

public class BufferOverrunExampleTest {
    @Test
    public void testShowBug() {
        BufferOverrunExample ex = new BufferOverrunExample();
        int result = ex.showBug(10, 10);
        assertEquals(10, result);
    }

    @Test
    public void testShowBug2() {
        BufferOverrunExample ex = new BufferOverrunExample();
        int result = ex.showBug(10, 100);
        assertEquals(100, result);
    }

    @Test
    public void testShowBug3() {
        BufferOverrunExample ex = new BufferOverrunExample();
        int result = ex.showBug(10, 1000);
        assertEquals(1000, result);
    }
}