import org.junit.Test;
import static org.junit.Assert.*;

public class BuggyControllerTest {

    @Test
    public void testShowBug() {
        BuggyController controller1 = new BuggyController();
        BuggyController controller2 = new BuggyController();

        controller1.setMessage("First Instance");
        controller2.setMessage("Second Instance");

        // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
        // Here, multiple instances of the controller are created which is not recommended
        assertNotEquals(controller1.getMessage(), controller2.getMessage());

        controller1.showBug();
        controller2.showBug();
    }
}