import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullFieldExampleTest {

    @Test
    public void testNonNullFieldNotInitialized() {
        NonNullFieldExample example = new NonNullFieldExample();
        assertNotNull(example.showBug()); // TRIGGER BUG: NP: Non-null field is not initialized (NP_NONNULL_FIELD_NOT_INITIALIZED_IN_CONSTRUCTOR)
    }
}