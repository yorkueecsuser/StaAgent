import org.junit.Test;
import static org.junit.Assert.*;

public class NonNullFieldExampleTest {

    @Test
    public void testShowBugWithNull() {
        NonNullFieldExample example = new NonNullFieldExample();
        example.showBug(null); // TRIGGER BUG: NP: Store of null value into field annotated @Nonnull (NP_STORE_INTO_NONNULL_FIELD)
    }
}