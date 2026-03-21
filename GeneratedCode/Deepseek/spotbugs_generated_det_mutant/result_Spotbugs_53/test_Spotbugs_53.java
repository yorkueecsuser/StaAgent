import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        Main.showBug(); // TRIGGER BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
    }
}