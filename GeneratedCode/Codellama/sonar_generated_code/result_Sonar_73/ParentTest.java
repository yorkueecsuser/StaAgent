import org.junit.Test;
import static org.junit.Assert.*;

public class SynchronizationBugTest {
    @Test
    public void testBugTrigger() {
        Child child = new Child();
        child.foo(); // TRIGGER BUG: Overrides should match their parent class methods in synchronization
    }
}