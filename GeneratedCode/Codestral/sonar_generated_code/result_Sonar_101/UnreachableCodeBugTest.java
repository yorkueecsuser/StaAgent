import org.junit.Test;
import static org.junit.Assert.*;

public class UnreachableCodeBugTest {

    @Test
    public void testShowBug() {
        UnreachableCodeBug bug = new UnreachableCodeBug();

        // Test case 1: The condition '!a || b' is always true because '!a' is true when 'a' is false.
        // TRIGGER BUG: Conditionally executed code should be reachable
        assertEquals(1, bug.showBug(false, false));

        // Test case 2: This case is intended to reach the else block, but it will fail because 'b' is never evaluated.
        // TRIGGER BUG: Conditionally executed code should be reachable
        assertEquals(2, bug.showBug(true, false));
    }
}