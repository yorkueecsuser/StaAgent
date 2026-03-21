import org.junit.Test;
import static org.junit.Assert.*;

public class BeanConfigTest {

    @Test
    public void testShowBug() {
        BeanConfig beanConfig = new BeanConfig();
        String result = beanConfig.showBug(); // TRIGGER BUG: Beans in "@Configuration" class should have different names
        assertEquals("Bean 2", result); // This assertion will fail because showBug() returns "Bean 1" due to the naming conflict.
    }
}