import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonBeanBugTest {

    @Test
    public void testShowBugTriggersMultipleInstances() {
        SingletonBeanBug bugDemo = new SingletonBeanBug();
        String result = bugDemo.showBug(); // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        String[] parts = result.split("\n");
        int bean1HashCode = Integer.parseInt(parts[0].split(": ")[1]);
        int bean2HashCode = Integer.parseInt(parts[1].split(": ")[1]);
        assertNotEquals(bean1HashCode, bean2HashCode); // This assertion will fail because two different instances are created
    }
}