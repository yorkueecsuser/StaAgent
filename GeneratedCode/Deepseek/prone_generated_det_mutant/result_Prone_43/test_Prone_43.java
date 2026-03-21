import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main m = new Main();
        m.showBug();
        // TRIGGER BUG: DurationToLongTimeUnit
    }
}