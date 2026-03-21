import org.junit.Test;
import static org.junit.Assert.*;

public class ATest {
    @Test
    public void testBug() {
        A a = new A();
        a.showBug(); // TRIGGER BUG: Getters and setters should access the expected fields
    }
}