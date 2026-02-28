import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchBugExampleTest {

    @Test
    public void testShowBugForNumber1() {
        SwitchBugExample example = new SwitchBugExample();
        assertEquals("One", example.showBug(1));
    }

    @Test
    public void testShowBugForNumber2() {
        SwitchBugExample example = new SwitchBugExample();
        assertEquals("Two", example.showBug(2)); // TRIGGER BUG: NonCaseLabelInSwitchStatement
    }

    @Test
    public void testShowBugForNumber3() {
        SwitchBugExample example = new SwitchBugExample();
        assertEquals("Other", example.showBug(3));
    }
}