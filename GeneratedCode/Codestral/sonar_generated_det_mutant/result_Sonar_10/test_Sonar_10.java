import org.junit.Test;
import static org.junit.Assert.*;

public class SpELBugDemoTest {

    @Test
    public void testShowBug() {
        SpELBugDemo demo = new SpELBugDemo();
        // TRIGGER BUG: SpEL expression should have a valid syntax
        demo.showBug();
    }
}