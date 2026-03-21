import org.junit.Test;
import static org.junit.Assert.*;

public class ConditionalBugDemoTest {

    @Test
    public void testShowBug() {
        ConditionalBugDemo demo = new ConditionalBugDemo();
        demo.showBug(); // TRIGGER BUG: All branches in a conditional structure should not have exactly the same implementation
    }
}