import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadTest {

    @Test
    public void testShowBug() {
        MyThread myThreadInstance = new MyThread();
        myThreadInstance.showBug(); // TRIGGER BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        assertFalse("The thread did not perform any specific action", true); // Test fails to demonstrate the bug
    }

    // Additional test case to ensure thread inactivity is caught
    @Test
    public void testThreadInactivity() {
        MyThread myThreadInstance = new MyThread();
        myThreadInstance.start(); // TRIGGER BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        assertFalse("The thread did not perform any specific action", true); // Test fails to demonstrate the bug
    }
}