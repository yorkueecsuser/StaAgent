import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullFieldBugTest {

    @Test
    // TRIGGER BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    public void testShowBug() {
        NonNullFieldBug bug = new NonNullFieldBug();
        assertNotNull(bug.showBug());
    }
}