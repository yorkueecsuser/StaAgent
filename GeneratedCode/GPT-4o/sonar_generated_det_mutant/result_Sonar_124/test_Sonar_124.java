import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class MathOperandsBugExampleTest {

    @Test
    public void testShowBug1() {
        MathOperandsBugExample example = new MathOperandsBugExample();
        float result = example.showBug1(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(0.6666667f, result, 0.0001); // This will fail because result is 0.0 instead of 0.6666667
    }

    @Test
    public void testShowBug2() {
        MathOperandsBugExample example = new MathOperandsBugExample();
        long result = example.showBug2(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(31_536_000_000L, result); // This will fail because result is 1471228928 instead of 31_536_000_000
    }

    @Test
    public void testShowBug3() {
        MathOperandsBugExample example = new MathOperandsBugExample();
        long result = example.showBug3(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(2_147_483_649L, result); // This will fail because result is -2147483647 instead of 2_147_483_649
    }

    @Test
    public void testShowBug4() {
        MathOperandsBugExample example = new MathOperandsBugExample();
        long result = example.showBug4(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(-2_147_483_649L, result); // This will fail because result is 2147483647 instead of -2_147_483_649
    }

    @Test
    public void testShowBug5() {
        MathOperandsBugExample example = new MathOperandsBugExample();
        Date result = example.showBug5(3_000_000); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(new Date(3_000_000L * 1_000), result); // This will fail because the result will be incorrect due to overflow
    }

    @Test
    public void testCompute() {
        MathOperandsBugExample example = new MathOperandsBugExample();
        long result = example.compute(300_000); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(3_000_000_000L, result); // This will fail because result is a negative number due to overflow
    }

    @Test
    public void testCompute2() {
        MathOperandsBugExample example = new MathOperandsBugExample();
        float result = example.compute2(123_000L); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(1000.0f, result, 0.1); // This will fail because result is not accurate due to integer division
    }
}