import org.junit.Test;
import static org.junit.Assert.*;

class RunFinalizersOnExitExample {

    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        System.runFinalizersOnExit(true);  // TRIGGER BUG: "runFinalizersOnExit" should not be called
    }

    @Deprecated
    protected void finalize() {
        doShutdownOperations();
    }

    private void doShutdownOperations() {
        System.out.println("Performing shutdown operations...");
    }
}

public class RunFinalizersOnExitExampleTest {

    @Test
    public void testShowBug() {
        RunFinalizersOnExitExample.showBug();  // TRIGGER BUG: "runFinalizersOnExit" should not be called
        fail("This test is expected to fail due to the bug in showBug method.");
    }
}