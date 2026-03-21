import org.junit.Test;
import static org.junit.Assert.*;

public class MockitoBugExampleTest {

    @Test
    public void testShowBugTriggersInvalidUseOfMatchersException() {
        MockitoBugExample example = new MockitoBugExample();
        int result = example.showBug(); // TRIGGER BUG: Mockito argument matchers should be used on all parameters
        assertEquals(10, result);
    }
}