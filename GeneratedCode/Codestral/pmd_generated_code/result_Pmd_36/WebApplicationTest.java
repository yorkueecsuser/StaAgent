import org.junit.Test;
import static org.junit.Assert.*;

public class WebApplicationTest {
    @Test
    public void testShowBug() {
        WebApplication webApp = new WebApplication();
        webApp.showBug(); // TRIGGER BUG: DoNotTerminateVM
        fail("The test should have terminated the JVM and not reach this point.");
    }
}