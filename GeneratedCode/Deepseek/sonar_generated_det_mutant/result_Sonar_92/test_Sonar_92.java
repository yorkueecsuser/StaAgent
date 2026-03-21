import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: Unary prefix operators should not be repeated
    public void testShowBug() {
        int input = 1;
        int result = Main.showBug(input);
        assertEquals("The bug should be triggered", 1, result);
    }
}