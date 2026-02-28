import org.junit.Test;
import static org.junit.Assert.*;

public class AsyncConfigTest {

    @Test
    public void testShowBug() {
        AsyncConfig asyncConfig = new AsyncConfig();
        asyncConfig.showBug(); // TRIGGER BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
        // The test should fail here because the '@Async' annotation on the 'init' method of 'AsyncConfig' class is not supported in Spring Boot.
    }
}