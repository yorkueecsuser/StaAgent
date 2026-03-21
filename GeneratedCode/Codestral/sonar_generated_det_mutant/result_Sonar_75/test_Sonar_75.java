import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionByZeroBugTest {
    private DivisionByZeroBug buggyClass = new DivisionByZeroBug();

    @Test
    public void testShowBug_ZeroDenominator_ShouldThrowException() {
        try {
            buggyClass.showBug(1, 0); // TRIGGER BUG: Zero should not be a possible denominator
            fail("Expected ArithmeticException was not thrown");
        } catch (ArithmeticException e) {
            // Expected exception, test case passed
        }
    }
}