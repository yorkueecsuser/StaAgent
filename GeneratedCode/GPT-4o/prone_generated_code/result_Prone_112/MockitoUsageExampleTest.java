import org.junit.Test;
import static org.junit.Assert.*;

public class MockitoUsageExampleTest {
    
    @Test
    public void testShowBug() {
        MockitoUsageExample example = new MockitoUsageExample();
        
        // This will trigger the bug since the method relies on simulated Mockito behavior
        example.showBug(); // TRIGGER BUG: MockitoUsage
    }
}