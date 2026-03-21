import org.junit.Test;
import static org.junit.Assert.*;

public class MyThreadTest {
    private class MyThread extends Thread {
        public void run() {
            System.out.println("Hello, World!");
        }
    }

    private void showBug() {
        MyThread myThread = new MyThread();
        myThread.start();
    }

    @Test // TRIGGER BUG: Classes extending java.lang.Thread should provide a specific "run" behavior
    public void testBug() {
        showBug();
    }
}