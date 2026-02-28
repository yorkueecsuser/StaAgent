import org.junit.Test;
import static org.junit.Assert.*;

public class AvoidLiteralsInIfConditionExampleTest {
    @Test
    public void testCheckRequestsWithBugTrigger() {
        AvoidLiteralsInIfConditionExample example = new AvoidLiteralsInIfConditionExample();
        assertTrue(example.showBug(10)); // TRIGGER BUG: AvoidLiteralsInIfCondition
    }
}