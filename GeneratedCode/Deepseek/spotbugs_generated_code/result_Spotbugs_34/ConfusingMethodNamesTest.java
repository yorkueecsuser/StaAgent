import org.junit.Test;
import static org.junit.Assert.*;

public class ConfusingMethodNamesTest {

    @Test
    public void showBugTest() {
        ConfusingMethodNames obj = new ConfusingMethodNames();
        assertEquals(5, obj.showBug(10, 5)); // TRIGGER BUG: Nm: Very confusing method names (NM_VERY_CONFUSING)
    }
}