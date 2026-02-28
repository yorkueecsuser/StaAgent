import org.junit.Test;
import static org.junit.Assert.*;

public class BugDemoTest {

    @Test
    public void testShowBug() {
        BugDemo demo = new BugDemo();
        double result = demo.showBug();
        assertTrue(Double.isNaN(result)); // TRIGGER BUG: "Double.longBitsToDouble" should take "long" as argument
    }
}