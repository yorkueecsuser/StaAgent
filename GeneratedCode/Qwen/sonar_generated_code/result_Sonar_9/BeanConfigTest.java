import org.junit.Test;
import static org.junit.Assert.*;

class BeanConfig {

    private String bean1;
    private String bean2;

    public void init() {
        bean1 = myBean1(); // BUG: Beans in "@Configuration" class should have different names
        bean2 = myBean2(); // BUG: Beans in "@Configuration" class should have different names
    }

    public String myBean1() {
        return "First Bean";
    }

    public String myBean2() { // BUG: Beans in "@Configuration" class should have different names
        return "Second Bean";
    }

    public String showBug() {
        return bean1 + ", " + bean2;
    }
}

public class BeanConfigTest {

    @Test
    public void testBeanConfig() {
        BeanConfig config = new BeanConfig();
        config.init();
        assertEquals("First Bean, Second Bean", config.showBug()); // TRIGGER BUG: Beans in "@Configuration" class should have different names
    }
}