import org.junit.Test;
import static org.junit.Assert.*;

public class MutableStaticFieldExampleTest {

    @Test
    public void testSharedMessageModification() {
        MutableStaticFieldExample example = new MutableStaticFieldExample();
        String originalMessage = MutableStaticFieldExample.sharedMessage;
        
        // Modify the sharedMessage using showBug method
        example.showBug("Updated Message"); // TRIGGER BUG: MS: Field should be package protected (MS_PKGPROTECT)

        // Verify that the sharedMessage has been modified
        assertNotEquals("The sharedMessage should have changed.", originalMessage, MutableStaticFieldExample.sharedMessage); // TRIGGER BUG: MS: Field should be package protected (MS_PKGPROTECT)
        
        // Restore original state
        MutableStaticFieldExample.sharedMessage = originalMessage;
    }
}