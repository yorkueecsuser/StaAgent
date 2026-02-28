import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Map;

public class BuggyConfigurationTest {

    @Test
    public void testBeanUniqueness() {
        BuggyConfiguration configuration = new BuggyConfiguration();
        Map<String, String> bean1 = configuration.myBean1();
        Map<String, String> bean2 = configuration.myBean2();

        // TRIGGER BUG: Beans in "@Configuration" class should have different names
        assertNotSame(bean1, bean2);
    }

    @Test
    public void testShowBugMethod() {
        BuggyConfiguration configuration = new BuggyConfiguration();
        Map<String, String> shownBean = configuration.showBug();

        // TRIGGER BUG: Beans in "@Configuration" class should have different names
        // The showBug method should return the map from the second bean, not the first one.
        assertEquals("value2", shownBean.get("key2"));
    }
}