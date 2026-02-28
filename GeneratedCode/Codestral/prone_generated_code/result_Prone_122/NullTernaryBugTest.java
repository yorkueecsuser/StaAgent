import org.junit.Test;
import static org.junit.Assert.*;

public class NullTernaryBugTest {
    @Test
    public void testShowBug() {
        NullTernaryBug bug = new NullTernaryBug();
        Integer result = bug.showBug();
        assertNotNull("ShowBug method returned null", result); // TRIGGER BUG: NullTernary
    }
}