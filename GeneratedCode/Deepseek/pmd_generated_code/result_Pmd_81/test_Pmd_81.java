import org.junit.Test;
import static org.junit.Assert.*;

public class UnnecessaryConversionTemporaryBugTest {

    UnnecessaryConversionTemporaryBug bug = new UnnecessaryConversionTemporaryBug();

    @Test
    public void testBugTrigger() {
        String result = bug.showBug(5); // TRIGGER BUG: UnnecessaryConversionTemporary
        assertNotEquals("5", result); // We expect this to fail as it triggers the bug
    }
}