import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerRemainderBugTest {
    @Test
    public void showBugTest() {
        IntegerRemainderBug bug = new IntegerRemainderBug();
        int i = 61;
        // TRIGGER BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
        assertEquals(1000, bug.showBug(i)); // The bug is triggered here, as i % 60 should be 1, not 1 * 1000
    }
}