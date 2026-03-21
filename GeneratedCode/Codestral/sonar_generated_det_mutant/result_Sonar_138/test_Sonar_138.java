import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadTest {
    @Test
    public void testShowBug() {
        MyThread thread = new MyThread();
        boolean printed =!thread.getState().equals(Thread.State.TERMINATED);
        thread.showBug();
        // TRIGGER BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        assertTrue("Expected 'Hello, World!' to be printed", printed);
    }
}