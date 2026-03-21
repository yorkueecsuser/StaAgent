import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperandsBugTest {

    @Test
    public void testShowBug1() {
        MathOperandsBug bug = new MathOperandsBug();
        float expectedResult = 0.6666667f; // Expected result if bug is fixed
        float actualResult = bug.showBug1();
        assertEquals(expectedResult, actualResult, 0.000001); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testShowBug2() {
        MathOperandsBug bug = new MathOperandsBug();
        long expectedResult = 31_536_000_000L; // Expected result if bug is fixed
        long actualResult = bug.showBug2();
        assertEquals(expectedResult, actualResult); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testShowBug3() {
        MathOperandsBug bug = new MathOperandsBug();
        long expectedResult = 2_147_483_649L; // Expected result if bug is fixed
        long actualResult = bug.showBug3();
        assertEquals(expectedResult, actualResult); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testShowBug4() {
        MathOperandsBug bug = new MathOperandsBug();
        long expectedResult = -2_147_483_649L; // Expected result if bug is fixed
        long actualResult = bug.showBug4();
        assertEquals(expectedResult, actualResult); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testCompute() {
        MathOperandsBug bug = new MathOperandsBug();
        long expectedResult = 214_748_000_000L; // Expected result if bug is fixed
        long actualResult = bug.compute(214_748);
        assertEquals(expectedResult, actualResult); // TRIGGER BUG: Math operands should be cast before assignment
    }

    @Test
    public void testCompute2() {
        MathOperandsBug bug = new MathOperandsBug();
        float expectedResult = 1687.0325f; // Expected result if bug is fixed
        float actualResult = bug.compute2(20_000);
        assertEquals(expectedResult, actualResult, 0.000001); // TRIGGER BUG: Math operands should be cast before assignment
    }
}