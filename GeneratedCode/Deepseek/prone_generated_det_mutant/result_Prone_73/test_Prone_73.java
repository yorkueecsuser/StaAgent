import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testShowBug() {
        assertEquals(42, Main.showBug()); // TRIGGER BUG: IncompatibleModifiers
    }
}