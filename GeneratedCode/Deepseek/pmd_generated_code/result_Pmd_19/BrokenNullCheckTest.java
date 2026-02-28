import org.junit.Test;
import static org.junit.Assert.*;

public class BrokenNullCheckTest {
    BrokenNullCheck brokenNullCheck = new BrokenNullCheck();

    @Test
    public void testShowBug() {
        String testString = "";
        // TRIGGER BUG: BrokenNullCheck
        String result = brokenNullCheck.showBug(testString);
        assertNull(result); // This line is expected to fail
    }
}