import org.junit.Test;
import static org.junit.Assert.*;

public class SwitchFallThroughBugTest {

    @Test
    public void testShowBugCase1() {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        assertEquals(10, bugDemo.showBug(1)); // TRIGGER BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH) 
    }

    @Test
    public void testShowBugCase2() {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        assertEquals(20, bugDemo.showBug(2));
    }

    @Test
    public void testShowBugDefault() {
        SwitchFallThroughBug bugDemo = new SwitchFallThroughBug();
        assertEquals(0, bugDemo.showBug(3));
    }
}