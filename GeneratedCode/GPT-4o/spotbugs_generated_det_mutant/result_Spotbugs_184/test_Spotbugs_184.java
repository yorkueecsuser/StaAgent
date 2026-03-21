import org.junit.Test;
import static org.junit.Assert.*;

public class NonFinalStaticFieldExampleTest {

    @Test
    public void testSharedResourceModification() {
        NonFinalStaticFieldExample example = new NonFinalStaticFieldExample();
        String initial = NonFinalStaticFieldExample.sharedResource;
        
        // This will modify the sharedResource and trigger the bug
        example.showBug("ModifiedValue"); // TRIGGER BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
        
        // Assert to ensure the field was modified, causing the test to fail
        assertNotEquals(initial, NonFinalStaticFieldExample.sharedResource);
    }

    @Test
    public void testSharedResourceDirectAccess() {
        NonFinalStaticFieldExample.sharedResource = "DirectModification"; // TRIGGER BUG: MS: Field isn’t final but should be (MS_SHOULD_BE_FINAL)
        
        // Assert to check if the sharedResource was modified directly
        assertEquals("DirectModification", NonFinalStaticFieldExample.sharedResource);
    }
}