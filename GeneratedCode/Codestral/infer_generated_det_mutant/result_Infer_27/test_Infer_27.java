import org.junit.Test;
import static org.junit.Assert.*;

public class BufferOverrunL3Test {

    @Test
    public void testShowBug() {
        BufferOverrunL3 ex = new BufferOverrunL3();
        int[] arr = new int[10];

        // TRIGGER BUG: BUFFER_OVERRUN_L3
        ex.showBug(arr, 11, 123); // Accessing index 11 which is out of bounds
    }
}