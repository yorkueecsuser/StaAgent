import org.junit.Test;
import static org.junit.Assert.*;

public class ThreadBugTest {
    @Test
    public void showBugTest() throws InterruptedException {
        ThreadBug bug = new ThreadBug();
        bug.showBug(); // TRIGGER BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    }
}