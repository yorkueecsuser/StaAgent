import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class DoNotMockExampleTest {

    @Test
    public void testShowBugTriggersDoNotMock() {
        DoNotMockExample example = new DoNotMockExample();
        List<DoNotMockExample.User> users = example.showBug(); // TRIGGER BUG: DoNotMock
        
        // The test is expected to fail because the bug triggers undesirable behavior
        assertEquals("Mocked User", users.get(0).getName()); // TRIGGER BUG: DoNotMock
    }
}