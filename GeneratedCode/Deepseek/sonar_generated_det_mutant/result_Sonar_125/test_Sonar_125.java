import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerShiftBugTest {

    @Test
    public void testShowBug() {
        IntegerShiftBug ib = new IntegerShiftBug();
        int result = ib.showBug(); // BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        // TRIGGER BUG: Ints and longs should not be shifted by zero or more than their number of bits-1
        // The line above should trigger a bug since we're shifting an int by 32, which is more than its number of bits
    }
}