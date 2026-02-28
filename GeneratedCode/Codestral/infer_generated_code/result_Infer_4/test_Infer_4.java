import org.junit.Test;
import static org.junit.Assert.*;

public class PerformanceCriticalOperationsTest {
    PerformanceCriticalOperations operations = new PerformanceCriticalOperations();

    @Test
    public void testPerfCriticalOperation() {
        try {
            operations.showBug(); // TRIGGER BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
            fail("Expected an exception due to a performance-critical operation calling an expensive operation");
        } catch (Exception e) {
            // Test passed if we got here
        }
    }
}