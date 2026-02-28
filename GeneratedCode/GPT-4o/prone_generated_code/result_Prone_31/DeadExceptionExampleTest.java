import org.junit.Test;
import static org.junit.Assert.*;

public class DeadExceptionExampleTest {

    @Test
    public void testShowBugTriggerDeadException() {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug(0); // TRIGGER BUG: DeadException
    }
}