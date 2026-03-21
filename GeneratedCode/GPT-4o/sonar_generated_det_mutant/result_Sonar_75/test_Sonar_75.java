import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionByZeroExampleTest {

    @Test
    public void testShowBugWithZeroDenominator() {
        DivisionByZeroExample example = new DivisionByZeroExample();
        example.showBug(0); // TRIGGER BUG: Zero should not be a possible denominator
    }
}