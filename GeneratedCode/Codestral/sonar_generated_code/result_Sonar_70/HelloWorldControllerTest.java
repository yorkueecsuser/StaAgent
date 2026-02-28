import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldControllerTest {

    @Test
    public void testNonSingletonScope() {
        HelloWorldController controller = new HelloWorldController();
        // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
        controller.showBug();
        // The test should fail at this line due to the bug in the code
    }
}