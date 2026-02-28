import org.junit.Test;
import static org.junit.Assert.*;

public class ConfusingMethodNamesTest {

    @Test
    public void testConfusingMethodNames() {
        ConfusingMethodNames demo = new ConfusingMethodNames();
        String result = demo.showBug(3, 4); // TRIGGER BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
        assertEquals("calculateSum(3, 4) = 7\ncalculatesum(3, 4) = 12", result);
    }
}