import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample bug = new BugExample();
        float result = bug.showBug();
        assertEquals("The result of this operation should be imprecise but Java rounds it to a 32-bit float", 16777216.0f, result, 0.0001); // TRIGGER BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    }
}