import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncConfigurationTest {

    @Test
    public void testAsyncMethodInConfiguration() {
        AsyncConfiguration config = new AsyncConfiguration();
        config.showBug(); // TRIGGER BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
        fail("The method asyncMethod() should not execute asynchronously within a @Configuration class."); // This line ensures the test fails
    }
}