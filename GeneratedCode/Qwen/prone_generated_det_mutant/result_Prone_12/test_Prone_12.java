import org.junit.Test;
import static org.junit.Assert.*;

public class BadShiftAmountExampleTest {

    @Test
    public void testShowBugWithShiftAmount32() {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 32); // TRIGGER BUG: BadShiftAmount
        assertEquals(2, result); // This will cause the test to fail
    }

    @Test
    public void testShowBugWithShiftAmount0() {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 0);
        assertEquals(1, result);
    }

    @Test
    public void testShowBugWithShiftAmount31() {
        BadShiftAmountExample example = new BadShiftAmountExample();
        int result = example.showBug(1, 31);
        assertEquals(1073741824, result);
    }
}