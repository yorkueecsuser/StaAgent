import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {

    @Test
    public void testShowBug() {
        MyConfiguration config = new MyConfiguration();
        String result = config.showBug();
        assertEquals("This configuration demonstrates the bug where @Qualifier is incorrectly used on @Bean methods.", result); // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
    }
}