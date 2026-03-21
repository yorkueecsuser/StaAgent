import org.junit.Test;
import static org.junit.Assert.*;

public class BitwiseBugTest {

    @Test
    public void testShowBug() {
        BitwiseBug bitwiseBug = new BitwiseBug();
        int result = bitwiseBug.showBug();
        // TRIGGER BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        assertEquals(0x7f454c46, result); // This should fail
    }
}