import org.junit.Test;
import static org.junit.Assert.*;

public class EncapsulationBugDemoTest {

    @Test
    public void testShowBug() {
        EncapsulationBugDemo demo = new EncapsulationBugDemo();
        int result = demo.showBug(42); // TRIGGER BUG: Getters and setters should access the expected fields
        assertEquals(42, result); // TRIGGER BUG: Getters and setters should access the expected fields
    }
}