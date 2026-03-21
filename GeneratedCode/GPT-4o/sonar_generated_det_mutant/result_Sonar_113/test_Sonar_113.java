import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadWaitNotifyExampleTest {

    @Test
    public void testShowBug() {
        ThreadWaitNotifyExample example = new ThreadWaitNotifyExample();
        example.showBug(); // TRIGGER BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    }
}