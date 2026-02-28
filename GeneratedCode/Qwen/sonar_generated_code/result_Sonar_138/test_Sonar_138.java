import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadExampleTest {

    @Test
    public void testMyThreadDoesNothing() {
        MyThreadExample example = new MyThreadExample();
        String result = example.showBug(); // TRIGGER BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        assertEquals("Expected output indicating no action was performed", "Check console for output (or lack thereof)", result);
        // The test will fail because the MyThread class does not override the run method, so no action is performed.
    }
}