import org.junit.Test;
import static org.junit.Assert.*;

public class UnsynchronizedStaticFormatterTest {
    private UnsynchronizedStaticFormatter formatter = new UnsynchronizedStaticFormatter();

    @Test
    public void testShowBug() throws Exception {
        Runnable task = new Runnable() {
            public void run() {
                formatter.showBug(); 
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join(); // TRIGGER BUG: UnsynchronizedStaticFormatter
    }
}