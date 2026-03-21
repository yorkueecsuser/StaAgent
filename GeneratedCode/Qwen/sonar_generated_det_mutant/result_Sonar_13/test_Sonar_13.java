import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {

    @Test
    public void testShowBug() {
        MyConfiguration config = new MyConfiguration();
        assertEquals("This configuration demonstrates the incorrect usage of @Qualifier on @Bean methods.", config.showBug()); // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
    }
}