import org.junit.Test;
import static org.junit.Assert.*;

public class ComparisonOutOfRangeExampleTest {

    @Test
    public void testShowBugWithOutOfRangeValue() {
        ComparisonOutOfRangeExample example = new ComparisonOutOfRangeExample();
        assertFalse(example.showBug((byte) 128)); // TRIGGER BUG: ComparisonOutOfRange
    }

    @Test
    public void testShowBugWithInRangeValue() {
        ComparisonOutOfRangeExample example = new ComparisonOutOfRangeExample();
        assertFalse(example.showBug((byte) 100));
    }
}