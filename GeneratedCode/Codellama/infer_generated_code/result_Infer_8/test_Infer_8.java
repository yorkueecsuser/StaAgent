import org.junit.Test;
import static org.junit.Assert.*;

public class CTest {
    @Test
    public void testShowBug() {
        C c = new C();
        c.showBug(); // TRIGGER BUG: GUARDEDBY_VIOLATION
    }
}