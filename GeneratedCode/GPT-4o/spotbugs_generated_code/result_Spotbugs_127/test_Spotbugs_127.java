import org.junit.Test;
import static org.junit.Assert.*;

public class OverwrittenIncrementExampleTest {

    @Test
    public void testShowBug() {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        int result = example.showBug(5); // TRIGGER BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        assertEquals(6, result); // The bug causes this test to fail because the expected increment does not occur
    }

    @Test
    public void testShowBug1() {
        OverwrittenIncrementExample example = new OverwrittenIncrementExample();
        int result = example.showBug1(5); // TRIGGER BUG: DLS: Overwritten increment (DLS_OVERWRITTEN_INCREMENT)
        assertEquals(4, result); // The bug causes this test to fail because the expected decrement does not occur
    }
}