import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionCheckerTest {
    @Test
    public void testShowBug() {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        assertEquals("The sum of the numbers is: 15", sum); // TRIGGER BUG: LoopConditionChecker
    }
}