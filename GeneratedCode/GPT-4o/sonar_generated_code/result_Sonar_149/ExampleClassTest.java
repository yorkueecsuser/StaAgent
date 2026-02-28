import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionBugDemoTest {

    @Test
    public void testShowBug() {
        ReflectionBugDemo demo = new ReflectionBugDemo();
        assertTrue(demo.showBug()); // TRIGGER BUG: Reflection should not be used to check non-runtime annotations
    }
}