import org.junit.Test;
import static org.junit.Assert.*;

public class IntToFloatRoundingTest {

    @Test
    public void testShowBugWithPositiveInteger() {
        IntToFloatRounding example = new IntToFloatRounding();
        int result = example.showBug(123); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        assertEquals(123, result); // This will fail if the bug is triggered
    }

    @Test
    public void testShowBugWithNegativeInteger() {
        IntToFloatRounding example = new IntToFloatRounding();
        int result = example.showBug(-456); // TRIGGER BUG: ICAST: int value cast to float and then passed to Math.round (ICAST_INT_CAST_TO_FLOAT_PASSED_TO_ROUND)
        assertEquals(-456, result); // This will fail if the bug is triggered
    }
}