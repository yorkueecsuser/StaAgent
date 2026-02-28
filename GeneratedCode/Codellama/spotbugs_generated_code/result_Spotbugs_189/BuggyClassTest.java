import org.junit.Test;
import static org.junit.Assert.*;

class BuggyClassTest {
    @Test
    public void testBuggyClass() {
        BuggyClass.showBug(); // TRIGGER BUG: MS: Field is a mutable collection (MS_MUTABLE_COLLECTION)
    }
}