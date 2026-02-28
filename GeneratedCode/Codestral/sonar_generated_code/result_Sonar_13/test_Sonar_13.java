import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {
    @Test
    public void testShowBug() {
        MyConfiguration config = new MyConfiguration();
        assertNotNull(config.showBug());
        // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
        // The bug is triggered here by calling the "showBug" method that uses the "myService" method
        // which does not use the "@Qualifier" and "@Bean" annotations as per the rule.
        // Since the MyService method in MyConfiguration class does not use "@Qualifier" and "@Bean" annotations,
        // there is no conflict and the bug is not triggered which would cause the test to fail.
    }
}