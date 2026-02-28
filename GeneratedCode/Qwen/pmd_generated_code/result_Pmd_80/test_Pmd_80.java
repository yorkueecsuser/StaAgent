import org.junit.Test;
import static org.junit.Assert.*;

public class CaseChangeExampleTest {

    @Test
    public void testShowBug() {
        CaseChangeExample example = new CaseChangeExample();
        assertFalse(example.showBug("baz")); // TRIGGER BUG: UnnecessaryCaseChange
    }

    @Test
    public void testShowBug2() {
        CaseChangeExample example = new CaseChangeExample();
        assertTrue(example.showBug2("baz")); // TRIGGER BUG: UnnecessaryCaseChange
    }
}