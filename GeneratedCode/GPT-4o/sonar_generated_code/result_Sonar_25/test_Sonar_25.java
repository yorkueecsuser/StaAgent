import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionAccessibilityBugDemoTest {

    @Test
    public void testShowBug() {
        ReflectionAccessibilityBugDemo demo = new ReflectionAccessibilityBugDemo();
        demo.showBug("Alice", 30, "Bob");
        // TRIGGER BUG: Reflection should not be used to increase accessibility of records' fields
    }
}