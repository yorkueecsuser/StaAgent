import org.junit.Test;
import static org.junit.Assert.*;

public class ZeroDenominatorTest {

    @Test
    public void testShowBugWithZeroDenominator() {
        ZeroDenominator demo = new ZeroDenominator();
        // TRIGGER BUG: Zero should not be a possible denominator
        demo.showBug(1, 0); // This will throw an ArithmeticException
    }
}