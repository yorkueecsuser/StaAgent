import org.junit.Test;
import static org.junit.Assert.*;

public class MixedDescriptorsExampleTest {

    @Test
    public void testMixedDescriptorsBug() {
        MixedDescriptorsExample example = new MixedDescriptorsExample();
        // Triggering the bug by calling the method that contains the bug
        assertEquals("Field not found", example.showBug()); // TRIGGER BUG: MixedDescriptors
    }
}