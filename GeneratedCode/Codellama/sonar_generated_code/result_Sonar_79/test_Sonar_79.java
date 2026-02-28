import org.junit.Test;
import static org.junit.Assert.*;

public class VolatileBugTest {
    @Test
    public void testShowBug() {
        VolatileBug bug = new VolatileBug();
        bug.showBug(); // TRIGGER BUG: "volatile" variables should not be used with compound operators
    }
}