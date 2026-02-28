import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date; // Import necessary for the Date class

public class MathOperandsBugDemoTest {

    @Test
    public void testShowBug1() {
        MathOperandsBugDemo demo = new MathOperandsBugDemo();
        float result = demo.showBug1(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(0.6666667f, result, 0.000001);
    }

    @Test
    public void testShowBug2() {
        MathOperandsBugDemo demo = new MathOperandsBugDemo();
        long result = demo.showBug2(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(31_536_000_000L, result);
    }

    @Test
    public void testShowBug3() {
        MathOperandsBugDemo demo = new MathOperandsBugDemo();
        long result = demo.showBug3(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(2_147_483_649L, result);
    }

    @Test
    public void testShowBug4() {
        MathOperandsBugDemo demo = new MathOperandsBugDemo();
        long result = demo.showBug4(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(-2_147_483_649L, result);
    }

    @Test
    public void testShowBug5() {
        MathOperandsBugDemo demo = new MathOperandsBugDemo();
        Date result = demo.showBug5(3_000_000); // TRIGGER BUG: Math operands should be cast before assignment
        assertNotNull(result);
    }

    @Test
    public void testCompute() {
        MathOperandsBugDemo demo = new MathOperandsBugDemo();
        long result = demo.compute(300_000); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(3_000_000_000L, result);
    }

    @Test
    public void testCompute2() {
        MathOperandsBugDemo demo = new MathOperandsBugDemo();
        float result = demo.compute2(246L); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(2.0f, result, 0.0);
    }
}