import org.junit.Test;
import static org.junit.Assert.*;

public class DoubleBitsToDoubleBugTest {
    @Test
    public void testBugTrigger() {
        int[] intArray = {1, 2, 3, 4, 5};
        double[] doubleArray = new double[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            doubleArray[i] = Double.longBitsToDouble((int) intArray[i]); // TRIGGER BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        }
        assertEquals(intArray.length, doubleArray.length);
        for (int i = 0; i < intArray.length; i++) {
            assertEquals(intArray[i], (int) doubleArray[i]);
        }
    }
}