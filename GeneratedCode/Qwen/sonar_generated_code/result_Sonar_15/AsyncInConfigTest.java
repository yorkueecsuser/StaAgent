import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncInConfigTest {

    @Test
    public void testShowBug() {
        AsyncInConfig config = new AsyncInConfig();
        config.showBug(); // TRIGGER BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
        fail("This test is expected to fail due to the bug"); // Ensure the test fails
    }
}