import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionByZeroBugTest {

    @Test
    public void testShowBugWithZeroDenominator() {
        DivisionByZeroBug bugDemo = new DivisionByZeroBug();
        int z = 0;
        bugDemo.showBug(z); // TRIGGER BUG: Zero should not be a possible denominator
    }

    @Test
    public void testShowBugWithNonZeroDenominator() {
        DivisionByZeroBug bugDemo = new DivisionByZeroBug();
        int z = 3;
        assertEquals(0, bugDemo.showBug(z));
    }
}