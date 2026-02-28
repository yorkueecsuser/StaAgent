import org.junit.Test;
import static org.junit.Assert.*;

public class RandomCastBugTest {

    @Test
    public void testShowBug() {
        RandomCastBug bug = new RandomCastBug();
        int result = bug.showBug();
        assertTrue("RandomCast bug triggered. Expected value between 0 and 1 but got " + result, result > 0 && result < 1); // TRIGGER BUG: RandomCast
    }
}