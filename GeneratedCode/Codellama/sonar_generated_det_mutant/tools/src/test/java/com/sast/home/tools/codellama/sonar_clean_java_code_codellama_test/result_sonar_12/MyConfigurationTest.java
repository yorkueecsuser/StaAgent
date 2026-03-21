import org.junit.Test;
import static org.junit.Assert.*;

public class MyConfigurationTest {

    @Test
    public void testYetAnotherService() {
        MyConfiguration configuration = new MyConfiguration();
        MyService service = configuration.yetAnotherService();
        // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        assertNotNull(service);
    }

    @Test
    public void testShowBug() {
        MyClient client = new MyClient();
        client.showBug();
        // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        assertTrue(client.getGreeting().equals("Hello"));
    }
}