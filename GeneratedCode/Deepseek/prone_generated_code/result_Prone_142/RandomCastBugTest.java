import org.junit.Test;
import static org.junit.Assert.*;

public class RandomCastBugTest {
    @Test
    public void testShowBug() {
        RandomCastBug bug = new RandomCastBug();
        int result = bug.showBug();
        assertEquals(0, result); // TRIGGER BUG: RandomCast
    }
}