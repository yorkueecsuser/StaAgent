import org.junit.Test;
import static org.junit.Assert.*;

public class RootBootAppTest {

    @Test
    public void testShowBug() {
        RootBootApp app = new RootBootApp();
        String result = app.showBug(); // TRIGGER BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
        assertEquals("This method demonstrates the bug by being part of the default package with @SpringBootApplication and @ComponentScan", result);
    }
}