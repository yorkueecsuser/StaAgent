import org.junit.Test;
import static org.junit.Assert.*;

public class EqualsNaNBugTest {

    @Test
    public void testShowBug() {
        EqualsNaNBug bug = new EqualsNaNBug();
        boolean result = bug.showBug(Double.NaN);
        assertFalse(result); // TRIGGER BUG: EqualsNaN
    }
}