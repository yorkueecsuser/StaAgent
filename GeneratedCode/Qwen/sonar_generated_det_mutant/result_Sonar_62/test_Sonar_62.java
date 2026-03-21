import org.junit.Test;
import static org.junit.Assert.*;

public class UnconditionalMapOverwriteTest {

    @Test
    public void testShowBug() {
        UnconditionalMapOverwrite example = new UnconditionalMapOverwrite();
        assertEquals("Apple", example.showBug());  // TRIGGER BUG: Map values should not be replaced unconditionally
    }

    @Test
    public void testShowBugArray() {
        UnconditionalMapOverwrite example = new UnconditionalMapOverwrite();
        String[] towns = new String[10];
        assertEquals("London", example.showBugArray(towns, 0));  // TRIGGER BUG: Map values should not be replaced unconditionally
    }
}