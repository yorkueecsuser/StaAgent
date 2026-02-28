import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchExampleTest {

    @Test
    public void testShowBugWithNonCaseLabel() {
        SwitchExample example = new SwitchExample();
        String result = example.showBug(1); // TRIGGER BUG: NonCaseLabelInSwitchStatement
        assertEquals("This is the default case.", result);
    }

    @Test
    public void testShowBugWithCaseTwo() {
        SwitchExample example = new SwitchExample();
        String result = example.showBug(2);
        assertEquals("This is number two.", result);
    }

    @Test
    public void testShowBugWithCaseThree() {
        SwitchExample example = new SwitchExample();
        String result = example.showBug(3);
        assertEquals("This is number three.", result);
    }

    @Test
    public void testShowBugWithDefaultCase() {
        SwitchExample example = new SwitchExample();
        String result = example.showBug(4);
        assertEquals("This is the default case.", result);
    }
}