import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerMultiplyBugExampleTest {

    @Test
    public void testShowBugWith125() {
        IntegerMultiplyBugExample example = new IntegerMultiplyBugExample();
        int result = example.showBug(125); // TRIGGER BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
        assertEquals("The calculation is incorrect due to operator precedence.", 5000, result);
    }

    @Test
    public void testShowBugWith60() {
        IntegerMultiplyBugExample example = new IntegerMultiplyBugExample();
        int result = example.showBug(60); // TRIGGER BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
        assertEquals("The calculation is incorrect due to operator precedence.", 0, result);
    }
}