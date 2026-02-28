import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testShowBug() {
        HelloWorld helloWorld1 = new HelloWorld();
        HelloWorld helloWorld2 = new HelloWorld();

        assertEquals("Counter: 1", helloWorld1.showBug()); // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
        assertEquals("Counter: 1", helloWorld2.showBug()); // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
    }
}