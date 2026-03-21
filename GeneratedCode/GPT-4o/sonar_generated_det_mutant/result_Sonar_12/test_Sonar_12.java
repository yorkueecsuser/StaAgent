import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonBeanExampleTest {

    @Test
    public void testShowBug() {
        SingletonConfig config = new SingletonConfig();
        String result1 = config.showBug(); // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        String result2 = config.showBug(); // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false

        // This assert will fail triggering the bug because each call will create a new instance
        assertEquals("Results should be equal indicating a singleton behavior", result1, result2);
    }
}