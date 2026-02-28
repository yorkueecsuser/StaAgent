import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyBeanTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: "@Autowired" should only be used on a single constructor
        // This test case will trigger the bug if used in a Spring application context.
        // It should fail due to multiple constructors.
        // However, without the Spring framework, we can't demonstrate the bug directly.
        BuggyBean buggyBean = new BuggyBean("dependencyB");
        buggyBean.showBug();
    }
}