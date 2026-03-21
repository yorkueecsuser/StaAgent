import org.junit.Test;
import static org.junit.Assert.*;

public class UselessIncrementBugTest {

    @Test
    public void testShowBug() {
        UselessIncrementBug bug = new UselessIncrementBug();
        int[] results = bug.showBug();
        assertEquals(0, results[0]); // TRIGGER BUG: Values should not be uselessly incremented
        assertEquals(0, results[1]); // TRIGGER BUG: Values should not be uselessly incremented
    }
}