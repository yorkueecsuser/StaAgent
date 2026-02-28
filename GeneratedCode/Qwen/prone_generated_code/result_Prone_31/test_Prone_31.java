import org.junit.Test;
import static org.junit.Assert.*;

public class DeadExceptionExampleTest {

    @Test
    public void testShowBugTriggersDeadException() {
        DeadExceptionExample example = new DeadExceptionExample();
        example.showBug(); // TRIGGER BUG: DeadException
    }
}