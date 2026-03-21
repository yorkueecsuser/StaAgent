import org.junit.Test;
import static org.junit.Assert.*;

public class VirtualThreadBugTest {
    
    @Test
    // TRIGGER BUG: Virtual threads should not run tasks that include synchronized code
    public void testEnqueue() {
        VirtualThreadBug bug = new VirtualThreadBug();
        bug.showBug(); // This line is the trigger for the bug
    }
}