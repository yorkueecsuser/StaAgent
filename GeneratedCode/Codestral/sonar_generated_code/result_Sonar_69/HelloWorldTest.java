import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testGreetMethodWithoutSetComplete() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setHello("World");

        // TRIGGER BUG: "@Controller" classes that use "@SessionAttributes" must call "setComplete" on their "SessionStatus" objects
        helloWorld.showBug("John");

        // Since setComplete() is not called, the session data is not cleaned up.
        // We add an assertion here that will fail if the session data is not cleared, triggering the bug.
        assertNull(helloWorld.getHello());
    }
}