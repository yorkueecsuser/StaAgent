import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionCheckerTest {
    @Test
    public void testShowBug() {
        LoopConditionChecker loopConditionChecker = new LoopConditionChecker();
        int[] numbers = {1, 2, 3};
        loopConditionChecker.showBug(numbers);
        // TRIGGER BUG: LoopConditionChecker - the test will fail here as the loop condition in showBug method is never modified
    }
}