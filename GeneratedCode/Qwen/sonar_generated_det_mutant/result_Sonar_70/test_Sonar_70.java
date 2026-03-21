import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void testShowBug() {
        HelloWorld helloWorld1 = new HelloWorld();
        HelloWorld helloWorld2 = new HelloWorld();

        assertEquals(helloWorld1.getMessage(), helloWorld2.getMessage()); // TRIGGER BUG: Spring "@Controller" classes should not use "@Scope"
    }
}