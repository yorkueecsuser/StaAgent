import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadBugTest {
    @Test
    public void testShowBug() throws InterruptedException {
        ThreadBug bug = new ThreadBug();

        Thread thread1 = new Thread(() -> {
            try {
                bug.showBug(); // TRIGGER BUG: "wait(...)" should be used instead of "Thread.sleep(...)" when a lock is held
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        Thread thread2 = new Thread(() -> {
            try {
                bug.showBug();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        thread1.start();
        thread2.start();

        Thread.sleep(2000); // Give some time for the threads to execute

        // The test will fail if the bug is not fixed, as the second thread will not be able to acquire the lock
        // and the program will hang indefinitely.
    }
}