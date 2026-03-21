import org.junit.Test;
import static org.junit.Assert.*;

public class RunFinalizersOnExitExampleTest {

    @Test
    public void testShowBugTriggersError() {
        RunFinalizersOnExitExample.showBug();  // TRIGGER BUG: "runFinalizersOnExit" should not be called
        fail("This test is expected to fail due to the usage of System.runFinalizersOnExit(true).");
    }
}