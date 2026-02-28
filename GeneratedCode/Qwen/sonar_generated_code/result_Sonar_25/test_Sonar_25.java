import org.junit.Test;
import static org.junit.Assert.*;

public class ReflectionBugExampleTest {

    @Test(expected = IllegalAccessException.class)
    public void testShowBug() throws NoSuchFieldException, IllegalAccessException {
        ReflectionBugExample example = new ReflectionBugExample();
        assertEquals("A", example.showBug()); // TRIGGER BUG: Reflection should not be used to increase accessibility of records' fields
    }
}