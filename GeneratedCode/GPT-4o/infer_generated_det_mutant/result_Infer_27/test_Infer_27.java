import org.junit.Test;
import static org.junit.Assert.*;

public class BufferOverrunExampleTest {

    @Test
    public void testBufferOverrun() {
        BufferOverrunExample example = new BufferOverrunExample();
        int size = 5;
        int index = 10;
        example.showBug(size, index); // TRIGGER BUG: BUFFER_OVERRUN_L3
    }
}