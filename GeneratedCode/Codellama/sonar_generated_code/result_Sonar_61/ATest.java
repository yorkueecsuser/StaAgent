import org.junit.Test;
import static org.junit.Assert.*;

public class ATest {
    @Test
    public void testShowBug() {
        A a = new A();
        a.showBug();
        // TRIGGER BUG: Getters and setters should access the expected fields
        assertEquals(10, a.getY());
    }
}