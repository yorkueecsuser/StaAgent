import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void triggerBug() {
        Main main = new Main();
        assertFalse("// TRIGGER BUG: Unnecessary equality checks should not be made", main.showBug());  // Line 6
        assertFalse("// TRIGGER BUG: Unnecessary equality checks should not be made", main.showBug());  // Line 8
        assertFalse("// TRIGGER BUG: Unnecessary equality checks should not be made", main.showBug());  // Line 10
        assertFalse("// TRIGGER BUG: Unnecessary equality checks should not be made", main.showBug());  // Line 12
        assertFalse("// TRIGGER BUG: Unnecessary equality checks should not be made", main.showBug());  // Line 14
        assertFalse("// TRIGGER BUG: Unnecessary equality checks should not be made", main.showBug());  // Line 16
    }
}