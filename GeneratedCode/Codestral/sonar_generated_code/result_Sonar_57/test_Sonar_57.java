import org.junit.Test;
import static org.junit.Assert.*;

public class MainApplicationTest {
    @Test
    // TRIGGER BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    public void testShowBug() {
        try {
            MainApplication.showBug();
            fail("Expected an exception to be thrown");
        } catch (Exception e) {
            // Expected exception
        }
    }
}