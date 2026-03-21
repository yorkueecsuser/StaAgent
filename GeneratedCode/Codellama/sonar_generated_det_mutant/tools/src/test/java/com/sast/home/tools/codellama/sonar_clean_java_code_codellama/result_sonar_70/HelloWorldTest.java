import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test
    public void showBugTest() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.showBug();

        // Expect the test to fail at line 21, where the @Scope annotation is used
        // in a Spring @Controller class
        fail("Expected test to fail at line 21");
    }
}