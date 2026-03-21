import org.junit.Test;
import static org.junit.Assert.*;

public class RootBootAppTest {
    @Test
    public void testShowBug() {
        RootBootApp.showBug(); // TRIGGER BUG: "@SpringBootApplication" and "@ComponentScan" should not be used in the default package
    }
}