import org.junit.Test;
import static org.junit.Assert.*;

public class BugExampleTest {
    @Test
    // TRIGGER BUG: GetClassOnClass
    public void testShowBug() {
        BugExample be = new BugExample();
        Class<?> c2 = be.showBug();
        Class<?> expected = Class.class;
        assertNotEquals(expected, c2);
    }
}