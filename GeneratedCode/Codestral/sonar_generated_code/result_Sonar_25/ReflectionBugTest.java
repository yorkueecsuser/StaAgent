import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionBugTest {

    @Test
    public void testShowBug() {
        ReflectionBug bug = new ReflectionBug();
        String result = bug.showBug();
        assertEquals("B", result); // TRIGGER BUG: Reflection should not be used to increase accessibility of records' fields
    }
}