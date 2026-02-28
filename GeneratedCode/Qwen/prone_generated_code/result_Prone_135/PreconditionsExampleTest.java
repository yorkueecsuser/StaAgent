import org.junit.Test;
import static org.junit.Assert.*;

public class PreconditionsExampleTest {

    @Test
    public void testShowBugWithNegativeValue() {
        PreconditionsExample example = new PreconditionsExample();
        example.showBug(-1); // TRIGGER BUG: PreconditionsInvalidPlaceholder
    }

    @Test
    public void testShowBugWithPositiveValue() {
        PreconditionsExample example = new PreconditionsExample();
        assertEquals("Valid value", example.showBug(1));
    }
}