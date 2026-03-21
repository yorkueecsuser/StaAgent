import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    // TRIGGER BUG: SF: Dead store due to switch statement fall through (SF_DEAD_STORE_DUE_TO_SWITCH_FALLTHROUGH)
    public void showBugTest() {
        Main.showBug();
    }
}