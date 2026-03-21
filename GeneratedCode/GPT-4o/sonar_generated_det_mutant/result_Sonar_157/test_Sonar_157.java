import org.junit.Test;
import static org.junit.Assert.*;

public class WindowControllerTest {

    @Test
    public void testShowBugWithParam1() {
        WindowController wc = new WindowController();
        String result = wc.showBug(1);  // TRIGGER BUG: Related "if/else if" statements should not have the same condition
        assertEquals("Window moved to the background", result);
    }

    @Test
    public void testShowBugWithParam2() {
        WindowController wc = new WindowController();
        String result = wc.showBug(2);
        assertEquals("Window closed", result);
    }

    @Test
    public void testShowBugWithParam3() {
        WindowController wc = new WindowController();
        String result = wc.showBug(3);
        assertEquals("No operation performed", result);
    }
}