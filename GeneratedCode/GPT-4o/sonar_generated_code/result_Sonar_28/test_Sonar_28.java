import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJConsumerBugExampleTest {
    
    @Test
    public void testShowBug_TriggerBug() {
        AssertJConsumerBugExample example = new AssertJConsumerBugExample();
        example.showBug("Hello"); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    }

    @Test
    public void testShowBug2_TriggerBug() {
        AssertJConsumerBugExample example = new AssertJConsumerBugExample();
        example.showBug2("Hello"); // TRIGGER BUG: AssertJ assertions with "Consumer" arguments should contain assertion inside consumers
    }
}