import org.junit.Test;
import static org.junit.Assert.*;

public class RunFinalizersOnExitBugTest {
    @Test
    public void testShowBug() {
        RunFinalizersOnExitBug bug = new RunFinalizersOnExitBug();
        int result = bug.showBug(); // TRIGGER BUG: "runFinalizersOnExit" should not be called
        // The bug is triggered in the showBug method, which calls runFinalization.
        // This is unsafe and can lead to erratic behavior and deadlocks on application exit.
        // The test will fail because the finalize method is called, which prints a message to the console.
        // Since JUnit tests do not capture console output, the test will fail due to an unexpected error.
        assertEquals(1, result); // This line will not be reached due to the bug triggering an error.
    }
}