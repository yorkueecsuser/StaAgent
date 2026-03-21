import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {

    @Test
    public void testShowBug() {
        MyConfiguration config = new MyConfiguration();
        config.showBug(); // TRIGGER BUG: "@Qualifier" should not be used on "@Bean" methods
        fail("The bug should have been triggered due to incorrect use of @Qualifier on @Bean methods."); // Ensure failure to indicate bug trigger
    }
}