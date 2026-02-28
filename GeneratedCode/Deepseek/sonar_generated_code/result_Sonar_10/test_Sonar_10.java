import org.junit.Test;
import static org.junit.Assert.*;

public class SpELBugTest {
    private SpELBug spELBug = new SpELBug();

    @Test
    public void testShowBug() {
        assertNotEquals("calc", spELBug.showBug().get(0));
        // TRIGGER BUG: SpEL expression should have a valid syntax
    }
}