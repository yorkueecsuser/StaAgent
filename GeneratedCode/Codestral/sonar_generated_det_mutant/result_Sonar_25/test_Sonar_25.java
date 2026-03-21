import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionBugDemoTest {
    @Test
    public void testShowBug() {
        ReflectionBugDemo.showBug(); // TRIGGER BUG: Reflection should not be used to increase accessibility of records' fields
    }
}