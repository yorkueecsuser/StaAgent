import org.junit.Test;
import static org.junit.Assert.assertNotSame;

public class HelloWorldControllerTest {

    @Test
    public void testShowBug() {
        HelloWorldController controller1 = new HelloWorldController(); // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
        HelloWorldController controller2 = new HelloWorldController(); // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
        
        // Assert that the two instances are different, which should not be the case for a controller
        assertNotSame(controller1.showBug(), controller2.showBug());  // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
    }
}