import org.junit.Test;
import static org.junit.Assert.*;

public class NonCompliantCodeExampleTest {
    NonCompliantCodeExample nonCompliantCodeExample = new NonCompliantCodeExample();

    // TRIGGER BUG: Zero should not be a possible denominator
    @Test(expected = ArithmeticException.class)
    public void testDivideBug() {
        int[] array = {1, 2, 3, 4, 5};
        nonCompliantCodeExample.showBug(array); // Line 8
    }
}