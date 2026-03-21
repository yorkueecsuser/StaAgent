import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testBug() {
        BugDemo bugDemo = new BugDemo();

        // Test showBug method
        try {
            bugDemo.showBug(); 
            fail("Expected an InterruptedException to be thrown"); 
        } catch (InterruptedException e) {
            // expected behaviour
        }
        // TRIGGER BUG: Methods "wait(...)", "notify()" and "notifyAll()" should not be called on Thread instances
    }
}