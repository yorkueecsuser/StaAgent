import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class MathOperandBugTest {

    private MathOperandBug bugDemo = new MathOperandBug();

    @Test
    public void testShowBug1() {
        float result = bugDemo.showBug1(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(0.6666667f, result, 0.0000001f);
    }

    @Test
    public void testShowBug2() {
        long result = bugDemo.showBug2(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(31_536_000_000L, result);
    }

    @Test
    public void testShowBug3() {
        long result = bugDemo.showBug3(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(2_147_483_649L, result);
    }

    @Test
    public void testShowBug4() {
        long result = bugDemo.showBug4(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(-2_147_483_649L, result);
    }

    @Test
    public void testShowBug5() {
        Date result = bugDemo.showBug5(2_147_483); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(new Date(2_147_483L * 1_000L), result);
    }

    @Test
    public void testCompute() {
        long result = bugDemo.compute(214_748); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(2_147_480_000L, result);
    }

    @Test
    public void testCompute2() {
        float result = bugDemo.compute2(123_000); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(123_000f / 123f, result, 0.0000001f);
    }
}