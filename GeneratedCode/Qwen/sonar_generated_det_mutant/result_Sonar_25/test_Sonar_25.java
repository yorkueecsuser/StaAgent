import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionBugExampleTest {

    @Test
    public void testShowBug() {
        ReflectionBugExample example = new ReflectionBugExample();
        assertEquals("A", example.showBug()); // TRIGGER BUG: Reflection should not be used to increase accessibility of records' fields
    }
}