import org.junit.Test;
import java.util.List;
import static org.junit.Assert.*;

public class MyConfigurationTest {

    @Test
    public void testShowBug() {
        MyConfiguration myConfiguration = new MyConfiguration();
        List<String> data1 = myConfiguration.showBug();
        MyConfiguration myConfiguration2 = new MyConfiguration();
        List<String> data2 = myConfiguration2.showBug();

        // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        assertNotSame(data1, data2);
    }
}