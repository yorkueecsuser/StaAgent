import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullFieldBugTest {

    @Test
    public void testNonNullFieldBug() {
        NonNullFieldBug bugInstance = new NonNullFieldBug();
        // TRIGGER BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
        assertNotNull(bugInstance.showBug());
    }
}