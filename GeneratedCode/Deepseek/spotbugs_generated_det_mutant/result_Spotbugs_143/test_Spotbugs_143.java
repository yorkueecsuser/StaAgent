import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    BugDemo bugDemo = new BugDemo();

    @Test
    public void testShowBug() {
        bugDemo.showBug(); // TRIGGER BUG: TQ: Value annotated as carrying a type qualifier used where a value that must not carry that qualifier is required (TQ_ALWAYS_VALUE_USED_WHERE_NEVER_REQUIRED)
    }
}