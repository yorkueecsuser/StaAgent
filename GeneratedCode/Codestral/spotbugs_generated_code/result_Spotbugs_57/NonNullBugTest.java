import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullBugTest {
    @Test
    public void testShowBug() {
        NonNullBug bug = new NonNullBug();
        bug.showBug(); // TRIGGER BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    }
}