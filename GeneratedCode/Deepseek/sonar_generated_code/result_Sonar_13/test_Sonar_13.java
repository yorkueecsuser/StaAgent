import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {

    private MyConfiguration myConfiguration = new MyConfiguration();

    @Test
    // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
    public void testShowBug() {
        myConfiguration.showBug();
    }
}