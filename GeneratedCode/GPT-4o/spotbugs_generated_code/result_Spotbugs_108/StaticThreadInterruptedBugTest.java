import org.junit.Test;
import static org.junit.Assert.*;

public class StaticThreadInterruptedBugTest {

    @Test
    public void testShowBug() {
        StaticThreadInterruptedBug bugDemonstration = new StaticThreadInterruptedBug();
        boolean result = bugDemonstration.showBug(); // TRIGGER BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
        assertTrue("The thread should not have been interrupted using instance method.", result); // TRIGGER BUG: STI: Static Thread.interrupted() method invoked on thread instance (STI_INTERRUPTED_ON_UNKNOWNTHREAD)
    }
}