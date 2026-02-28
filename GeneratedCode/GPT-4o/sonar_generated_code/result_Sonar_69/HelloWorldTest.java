import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testShowBug() {
        HelloWorld helloWorld = new HelloWorld();
        
        // Attempt to trigger the bug by simulating a session attribute scenario
        String result = helloWorld.showBug("World"); // TRIGGER BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
        
        // Assert expected result to force failure and highlight the bug
        assertEquals("Hello World", result);
        
        // Additional logic could be placed here to simulate session status, but will fail to trigger the bug
        // because the @Controller does not handle session cleanup.
    }
}