import org.junit.Test;
import static org.junit.Assert.*;

public class DescriptorBugDemoTest {

    @Test
    public void testShowBug() {
        DescriptorBugDemo demo = new DescriptorBugDemo();
        String result = demo.showBug(); // TRIGGER BUG: MixedDescriptors
        assertEquals("Field found in Foo with field number 1", result); // This assertion will fail
    }
}