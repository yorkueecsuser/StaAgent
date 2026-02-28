import org.junit.Test;
import static org.junit.Assert.*;

public class DaggerProvidesNullBugTest {

    private DaggerProvidesNullBug bug = new DaggerProvidesNullBug();

    @Test
    public void testShowBug() {
        try {
            bug.showBug();
            fail("Expected an NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // TRIGGER BUG: DaggerProvidesNull
        }
    }
}