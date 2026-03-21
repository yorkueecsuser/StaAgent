import org.junit.Test;
import static org.junit.Assert.*;

public class ConfusingMethodNamesTest {
    ConfusingMethodNames confusingMethodNames = new ConfusingMethodNames();

    @Test
    public void testShowBug() {
        assertNotEquals(confusingMethodNames.showBug1(null, null), confusingMethodNames.showBug(null, null)); // TRIGGER BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
    }
}