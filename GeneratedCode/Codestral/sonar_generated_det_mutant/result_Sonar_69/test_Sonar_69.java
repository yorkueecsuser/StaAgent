import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    @Test
    public void testShowBug() {
        HelloWorldController controller = new HelloWorldController();
        String result = controller.showBug("John"); // TRIGGER BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
        assertNotEquals("Greeting removed from session.", result); // The bug is triggered, so the result should not be "Greeting removed from session."
    }
}