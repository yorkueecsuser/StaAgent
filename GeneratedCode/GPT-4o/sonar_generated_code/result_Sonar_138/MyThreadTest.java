import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadTest {

    @Test
    public void testShowBug() {
        MyThread myThread = new MyThread();
        myThread.showBug(); // TRIGGER BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
        fail("Expected showBug to trigger a bug due to missing run method override in MyThread class.");
    }
}