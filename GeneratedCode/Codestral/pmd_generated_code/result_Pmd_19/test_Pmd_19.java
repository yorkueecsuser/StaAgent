import org.junit.Test;
import static org.junit.Assert.*;

public class BrokenNullCheckBugTest {

    @Test
    public void testShowBugWithNull() {
        BrokenNullCheckBug bug = new BrokenNullCheckBug();
        // TRIGGER BUG: BrokenNullCheck
        String result = bug.showBug(null); // This should trigger the NullPointerException
        assertNotNull(result);
    }
}