import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {

    @Test
    public void testShowBug() {
        MyConfiguration myConfiguration = new MyConfiguration();
        assertEquals("Hello World", myConfiguration.showBug());
        // TRIGGER BUG: Beans in "@Configuration" class should have different names
        assertEquals("Hello World", myConfiguration.showBug());
    }
}