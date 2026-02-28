import org.junit.Test;
import static org.junit.Assert.*;

public class NonCaseLabelInSwitchTest {
    NonCaseLabelInSwitch nonCaseLabelInSwitch = new NonCaseLabelInSwitch();

    @Test
    public void testShowBug() {
        int result = nonCaseLabelInSwitch.showBug(0); // TRIGGER BUG: NonCaseLabelInSwitch
        assertEquals(0, result);
    }
}