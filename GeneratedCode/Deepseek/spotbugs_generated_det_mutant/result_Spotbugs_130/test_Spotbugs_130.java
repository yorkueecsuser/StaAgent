import org.junit.Test;
import static org.junit.Assert.*;

public class IntegerMultiplyBugTest {

    IntegerMultiplyBug bug = new IntegerMultiplyBug();

    @Test
    public void testShowBug() {
        assertEquals(4000, bug.showBug(86)); // TRIGGER BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    }
}