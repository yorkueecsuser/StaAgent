import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullFieldNotInitializedTest {
    @Test
    public void testBugTrigger() {
        NonNullFieldNotInitialized testObject = new NonNullFieldNotInitialized(null);
        // TRIGGER BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
        assertNull(testObject.showBug());
    }
}