import org.junit.Test;
import static org.junit.Assert.*;

public class MockExampleTest {

    @Test
    public void testShowBug() {
        MockExample example = new MockExample();
        String result = example.showBug("Sample Input"); // TRIGGER BUG: DoNotMock
        assertEquals("Expected Response", result); // This assertion will fail, triggering the bug
    }
}