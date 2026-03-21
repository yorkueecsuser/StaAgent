import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testShowBug() {
        int x = 5;
        // TRIGGER BUG: DLS: Useless increment in return statement (DLS_DEAD_LOCAL_INCREMENT_IN_RETURN)
        int result = Main.showBug(x);
        assertNotEquals(x, result);
    }
}