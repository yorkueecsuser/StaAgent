import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionCheckerExampleTest {

    @Test
    public void testShowBugWithStartBelowTen() {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // TRIGGER BUG: LoopConditionChecker
    }

    // Additional test that also triggers the bug
    @Test
    public void testShowBugWithStartZero() {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(0); // TRIGGER BUG: LoopConditionChecker
    }
}