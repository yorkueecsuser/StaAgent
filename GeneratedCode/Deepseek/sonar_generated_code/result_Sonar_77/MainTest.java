import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: Expressions used in "assert" should not produce side effects
    public void testShowBug() {
        Main m = new Main();
        m.showBug();
    }
}