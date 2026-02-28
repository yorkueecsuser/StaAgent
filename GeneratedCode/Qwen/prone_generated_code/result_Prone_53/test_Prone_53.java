import org.junit.Test;
import static org.junit.Assert.*;

class ForOverrideBugDemoTest {

    @Test
    public void testShowBugTriggersForOverride() {
        ForOverrideBugDemo demo = new ForOverrideBugDemo();
        demo.showBug(); // TRIGGER BUG: ForOverride
    }
}