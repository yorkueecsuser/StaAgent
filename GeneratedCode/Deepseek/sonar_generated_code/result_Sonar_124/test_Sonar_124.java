import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperandBugTest {
    MathOperandBug bug = new MathOperandBug();

    @Test
    public void testShowBug() {
        float result = bug.showBug(2, 3); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(0.66666666f, result, 0.000001f);
    }

    @Test
    public void testShowBug2() {
        long result = bug.showBug2(3); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(30_000L, result);
    }

    @Test
    public void testShowBug3() {
        float result = bug.showBug3(123); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(9.8777777f, result, 0.000001f);
    }

    @Test
    public void testCompute() {
        long result = bug.compute(2, 10_000);
        assertEquals(20_000L, result);
    }

    @Test
    public void testCompute2() {
        float result = bug.compute2(123, 123);
        assertEquals(1.0f, result, 0.000001f);
    }
}