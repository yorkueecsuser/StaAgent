import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class MathOperandBugTest {

    private MathOperandBug bugInstance = new MathOperandBug();

    @Test
    public void testShowBug1() {
        float result = bugInstance.showBug1(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(0.6666667f, result, 0.0000001f); // Expected value is 0.6666667, but actual will be 0.0
    }

    @Test
    public void testShowBug2() {
        long result = bugInstance.showBug2(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(31536000000L, result); // Expected value is 31536000000, but actual will be 1471228928
    }

    @Test
    public void testShowBug3() {
        long result = bugInstance.showBug3(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(2147483649L, result); // Expected value is 2147483649, but actual will be -2147483647
    }

    @Test
    public void testShowBug4() {
        long result = bugInstance.showBug4(); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(-2147483649L, result); // Expected value is -2147483649, but actual will be 2147483647
    }

    @Test
    public void testShowBug5() {
        Date expectedDate = new Date((long)2147483647 * 1000);
        Date result = bugInstance.showBug5(2147483647); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(expectedDate, result); // Expected date is calculated with long cast, but actual will be incorrect
    }

    @Test
    public void testCompute() {
        long result = bugInstance.compute(21474); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(214740000L, result); // Expected value is 214740000, but actual will be -2147483648
    }

    @Test
    public void testCompute2() {
        float result = bugInstance.compute2(12300); // TRIGGER BUG: Math operands should be cast before assignment
        assertEquals(100.0f, result, 0.0000001f); // Expected value is 100.0, but actual will be 99.0
    }
}