import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionByZeroExampleTest {

    @Test
    public void testShowBugWithZeroDenominator() {
        DivisionByZeroExample example = new DivisionByZeroExample();
        example.showBug(1, 0); // TRIGGER BUG: Zero should not be a possible denominator
    }

    @Test
    public void testShowBug1WithZeroDenominator() {
        DivisionByZeroExample example = new DivisionByZeroExample();
        example.showBug1(1, 0); // TRIGGER BUG: Zero should not be a possible denominator
    }
}