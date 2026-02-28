import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {
    @Test
    public void testBug() {
        SynchronizationBug bug = new SynchronizationBug();
        bug.doSomething();
    }
}