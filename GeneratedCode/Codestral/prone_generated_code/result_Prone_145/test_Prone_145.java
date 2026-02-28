import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemonstratorTest {

    @Test
    // TRIGGER BUG: RequiredModifiers - The bug is triggered when the test case tries to access the buggyField of BugDemonstrator,
    // which is missing the 'public' and'static' modifiers required by the @RequiredModifiers annotation on @CustomAnnotation.
    public void testShowBug() {
        BugDemonstrator bugDemonstrator = new BugDemonstrator();
        bugDemonstrator.showBug(); // This line will cause a compilation error due to the bug in BugDemonstrator class.
    }
}