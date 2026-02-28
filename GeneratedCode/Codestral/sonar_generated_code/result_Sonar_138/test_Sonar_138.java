import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadTest {

    @Test
    public void testShowBug() {
        MyThread myThread = new MyThread();
        myThread.showBug(); // TRIGGER BUG: This will not print anything as the run method is not overridden
        // The test will fail here because no output is produced
    }
}