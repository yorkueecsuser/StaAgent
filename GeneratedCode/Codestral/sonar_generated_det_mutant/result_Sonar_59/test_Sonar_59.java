import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {
    @Test
    public void testShowBug() {
        assertThrows(ClassCastException.class, () -> {
            BugDemo.showBug(); // TRIGGER BUG: "compareTo" should not be overloaded
        });
    }
}