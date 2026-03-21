import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {

    @Test
    public void testShowBug() {
        BugExample bugExample = new BugExample(null); // Trigger the bug by passing null to BugExample constructor
        bugExample.showBug(); // Trigger the bug by calling showBug
    }
}