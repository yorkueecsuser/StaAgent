import org.junit.Test;
import static org.junit.Assert.*;

public class MethodExceptionExampleTest {

    @Test
    public void testShowBugWithZeroDenominator() {
        MethodExceptionExample example = new MethodExceptionExample();
        int numerator = 10;
        int denominator = 0;
        
        // This should fail because it will trigger an IllegalArgumentException
        example.showBug(numerator, denominator); // TRIGGER BUG: Calls to methods should not trigger an exception
    }

    @Test
    public void testDivideWithZeroDenominator() {
        MethodExceptionExample example = new MethodExceptionExample();
        
        // This should also fail because it will directly trigger an IllegalArgumentException
        example.divide(5, 0); // TRIGGER BUG: Calls to methods should not trigger an exception
    }
}