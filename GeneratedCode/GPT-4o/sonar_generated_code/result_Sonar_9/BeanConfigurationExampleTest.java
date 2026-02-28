import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sast.home.tools.sonar_clean_java_code.result_sonar_9.BeanConfigurationExample;

public class BeanConfigurationExampleTest {

    @Test
    public void testBeanNamingConflict() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanConfigurationExample.class);
        try {
            String bean = (String) context.getBean("myBean"); // TRIGGER BUG: Beans in "@Configuration" class should have different names
            fail("Expected an exception due to bean naming conflict but none was thrown.");
        } catch (Exception e) {
            assertTrue("Exception due to ambiguous bean name", e.getMessage().contains("myBean"));
        } finally {
            context.close();
        }
    }
}