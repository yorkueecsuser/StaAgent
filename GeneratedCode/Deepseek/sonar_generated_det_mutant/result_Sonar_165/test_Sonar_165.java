import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    private BugDemo bugDemo = new BugDemo();

    @Test // TRIGGER BUG: Method parameters, caught exceptions and foreach variables' initial values should not be ignored
    public void testDoTheThing() {
        bugDemo.showBug();
    }
}