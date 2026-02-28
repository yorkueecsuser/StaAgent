import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationBugTest {

    @Test
    public void testComputeFloat() {
        MathOperationBug bug = new MathOperationBug();
        float result = bug.computeFloat(2);
        assertNotEquals(0.6666667, result, 0.0001); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testComputeLong() {
        MathOperationBug bug = new MathOperationBug();
        long result = bug.computeLong(214748);
        assertNotEquals(2147480000L, result); // TRIGGER BUG: Math operands should be cast before assignment
    }
}