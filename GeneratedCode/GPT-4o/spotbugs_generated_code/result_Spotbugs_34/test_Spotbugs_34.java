import org.junit.Test;
import static org.junit.Assert.*;

public class ConfusingMethodNamesTest {

    @Test
    public void testShowBug() {
        ConfusingMethodNames instance = new ConfusingMethodNames();
        int result = instance.showBug(2, 3); // TRIGGER BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        assertEquals("The showBug method should return a consistent result", 0, result);
    }

    @Test
    public void testShowBugWithDifferentValues() {
        ConfusingMethodNames instance = new ConfusingMethodNames();
        int result = instance.showBug(4, 5); // TRIGGER BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        assertEquals("The showBug method should return a consistent result", 0, result);
    }
}