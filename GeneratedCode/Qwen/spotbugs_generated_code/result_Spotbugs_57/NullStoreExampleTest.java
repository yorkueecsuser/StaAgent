import org.junit.Test;
import static org.junit.Assert.*;

public class NullStoreExampleTest {

    @Test
    public void testShowBugTriggersNullAssignment() {
        NullStoreExample example = new NullStoreExample();
        example.showBug(); // TRIGGER BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
        assertNotNull(example.getNonNullField()); // This assertion will fail because nonNullField is set to null
    }
}