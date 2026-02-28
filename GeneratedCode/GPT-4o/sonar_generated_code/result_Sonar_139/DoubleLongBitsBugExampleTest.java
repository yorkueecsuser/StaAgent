import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleLongBitsBugExampleTest {

    @Test
    public void testShowBug() {
        DoubleLongBitsBugExample example = new DoubleLongBitsBugExample();
        int input = 0x80003800;
        double result = example.showBug(input); // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
        assertFalse("Expected NaN due to incorrect conversion", Double.isNaN(result));
    }
}