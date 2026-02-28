import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonBeanConfigurationTest {

    @Test
    public void testShowBug() {
        SingletonBeanConfiguration config = new SingletonBeanConfiguration();
        assertTrue("Expected the singletonBean to be the same instance, but it was not.", config.showBug()); 
        // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
    }
}