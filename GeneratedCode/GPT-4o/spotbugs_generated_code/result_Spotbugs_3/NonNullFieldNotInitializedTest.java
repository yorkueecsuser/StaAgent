import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullFieldNotInitializedTest {

    @Test
    public void testShowBug() {
        NonNullFieldNotInitialized example = new NonNullFieldNotInitialized();
        String result = example.showBug(); // TRIGGER BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
        assertNull(result); // This is expected to fail due to the bug
    }
}