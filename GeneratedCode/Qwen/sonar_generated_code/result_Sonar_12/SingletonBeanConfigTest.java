import org.junit.Test;
import static org.junit.Assert.*;

public class SingletonBeanConfigTest {

    @Test
    public void testSingletonBeanCreation() {
        SingletonBeanConfig config = new SingletonBeanConfig();
        config.showBug(); // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false

        MySingletonBean bean1 = config.mySingletonBean();
        MySingletonBean bean2 = config.mySingletonBean();

        assertNotSame(bean1, bean2); // This assertion will fail because the beans should be the same if properly singleton
    }
}