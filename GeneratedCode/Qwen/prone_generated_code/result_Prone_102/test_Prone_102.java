import org.junit.Test;
import static org.junit.Assert.*;

public class LoopConditionCheckerExampleTest {

    @Test
    public void testShowBugTriggersInfiniteLoop() {
        LoopConditionCheckerExample example = new LoopConditionCheckerExample();
        example.showBug(5); // TRIGGER BUG: LoopConditionChecker
    }
}