import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testShowBug() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.showBug("World"); // TRIGGER BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
        assertEquals("Hello World", result);
    }
}