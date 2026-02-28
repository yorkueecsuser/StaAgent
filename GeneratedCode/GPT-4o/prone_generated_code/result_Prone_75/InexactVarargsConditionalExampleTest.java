import org.junit.Test;
import static org.junit.Assert.*;

public class InexactVarargsConditionalExampleTest {

    @Test
    public void testShowBugTrue() {
        String result = InexactVarargsConditionalExample.showBug(true); // TRIGGER BUG: InexactVarargsConditional
        assertEquals("[[1, 2]]", result);
    }

    @Test
    public void testShowBugFalse() {
        String result = InexactVarargsConditionalExample.showBug(false); // TRIGGER BUG: InexactVarargsConditional
        assertEquals("[3]", result);
    }
}