import org.junit.Test;
import static org.junit.Assert.*;

public class UnsafeWildcardBugTest {
    @Test(expected = ClassCastException.class)
    public void testShowBug() {
        UnsafeWildcardBug buggyClass = new UnsafeWildcardBug();
        // The line below triggers the bug: UnsafeWildcard
        buggyClass.showBug(); // TRIGGER BUG: UnsafeWildcard
    }
}