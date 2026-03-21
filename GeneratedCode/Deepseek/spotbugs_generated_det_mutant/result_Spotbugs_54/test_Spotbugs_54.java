import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    // TRIGGER BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
    public void testShowBug() {
        int result = Main.showBug();
        assertNotEquals(1, result);
        assertNotEquals(-1, result);
    }
}