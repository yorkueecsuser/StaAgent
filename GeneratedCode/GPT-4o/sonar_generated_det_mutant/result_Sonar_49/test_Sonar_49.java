import org.junit.Test;
import static org.junit.Assert.*;

public class AssertJBugDemoTest {

    @Test
    public void testShowBug() {
        AssertJBugDemo demo = new AssertJBugDemo();
        demo.showBug("actualValue", "expectedValue"); // TRIGGER BUG: AssertJ methods setting the assertion context should come before an assertion
    }
}