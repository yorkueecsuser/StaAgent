import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadBugExampleTest {
    @Test
    public void testBug() throws InterruptedException {
        Thread myThread = new Thread(new RunnableJob());
        myThread.start();
        myThread.wait(); // TRIGGER BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    }
}