import org.junit.Test;
import static org.junit.Assert.*;

public class RootBootAppTest {
    @Test
    public void testShowBug() {
        // TRIGGER BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
        RootBootApp.showBug();
    }
}