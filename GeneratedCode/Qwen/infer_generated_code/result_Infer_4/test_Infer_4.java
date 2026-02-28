import org.junit.Test;
import static org.junit.Assert.*;

public class PerformanceIssueDemoTest {

    @Test
    public void testPerfCriticalCallsExpensive() {
        PerformanceIssueDemo demo = new PerformanceIssueDemo();
        demo.showBug(); // TRIGGER BUG: CHECKERS_CALLS_EXPENSIVE_METHOD
    }
}