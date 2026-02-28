import org.junit.Test;
import static org.junit.Assert.*;

public class FinalizerBugDemoTest {

    @Test
    public void testShowBugTriggersFinalizerIssue() {
        FinalizerBugDemo.showBug();  // TRIGGER BUG: "runFinalizersOnExit" should not be called
        fail("The method showBug should trigger a bug due to unsafe use of runFinalizersOnExit.");  // This line will ensure the test fails to highlight the bug
    }
}

class FinalizerBugDemo {

    public static void main(String[] args) {
        showBug();
    }
    
    public static void showBug() {
        // TRIGGER BUG: "runFinalizersOnExit" should not be called
        Runtime.runFinalizersOnExit(true);  // BUG: "runFinalizersOnExit" should not be called
    }
    
    @Override
    protected void finalize() {
        doShutdownOperations();
    }

    private static void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }
}