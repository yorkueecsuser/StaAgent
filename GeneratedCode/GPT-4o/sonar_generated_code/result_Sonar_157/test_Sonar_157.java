import org.junit.Test;
import static org.junit.Assert.*;

public class WindowManagerTest {

    @Test
    public void testShowBugWithParam1() {
        WindowManager wm = new WindowManager();
        String result = wm.showBug(1);
        assertEquals("Window moved to the background.", result); // TRIGGER BUG: Related "if/else if" statements should not have the same condition
    }

    @Test
    public void testShowBugWithParam2() {
        WindowManager wm = new WindowManager();
        String result = wm.showBug(2);
        assertEquals("Window closed.", result);
    }

    @Test
    public void testShowBugWithParam3() {
        WindowManager wm = new WindowManager();
        String result = wm.showBug(3);
        assertEquals("No action performed", result);
    }
}