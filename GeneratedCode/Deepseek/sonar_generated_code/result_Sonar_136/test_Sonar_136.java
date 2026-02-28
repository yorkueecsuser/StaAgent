import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void testInterruptedException() throws InterruptedException {
        Main main = new Main();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                main.run();
            }
        });
        thread.start();
        thread.interrupt();
        thread.join();
        // TRIGGER BUG: "InterruptedException" and "ThreadDeath" should not be ignored
    }
}