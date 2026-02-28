import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.fail;

public class DemoBugTest {
    private DemoBug bug;

    @Before
    public void setUp() {
        bug = new DemoBug();
    }

    @After
    public void tearDown() {
        bug = null;
    }

    @Test
    public void showBug() {
        try {
            bug.showBug(); // TRIGGER BUG: AvoidCallingFinalize
            fail("Expected an IllegalMonitorStateException to be thrown");
        } catch (IllegalMonitorStateException e) {
            // Expected exception, test passes
        } catch (Exception e) {
            fail("Unexpected exception thrown: " + e.getClass().getName());
        }
    }
}