import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        assertTrue(Main.showBug()); // TRIGGER BUG: ComparisonOutOfRange
    }
}