import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerRemainderBugTest {

    @Test
    public void testShowBug() {
        IntegerRemainderBug bugDemo = new IntegerRemainderBug();
        // Expected result if the bug were not present: 12345 % 60000 = 12345
        // Actual result due to the bug: (12345 % 60) * 1000 = 45 * 1000 = 45000
        assertEquals(12345, bugDemo.showBug(12345)); // TRIGGER BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)  
    }

    @Test
    public void testShowBugWithZero() {
        IntegerRemainderBug bugDemo = new IntegerRemainderBug();
        // Expected result if the bug were not present: 0 % 60000 = 0
        // Actual result due to the bug: (0 % 60) * 1000 = 0 * 1000 = 0
        assertEquals(0, bugDemo.showBug(0)); // TRIGGER BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)  
    }

    @Test
    public void testShowBugWithNegative() {
        IntegerRemainderBug bugDemo = new IntegerRemainderBug();
        // Expected result if the bug were not present: -12345 % 60000 = -12345
        // Actual result due to the bug: (-12345 % 60) * 1000 = -45 * 1000 = -45000
        assertEquals(-12345, bugDemo.showBug(-12345)); // TRIGGER BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)  
    }
}