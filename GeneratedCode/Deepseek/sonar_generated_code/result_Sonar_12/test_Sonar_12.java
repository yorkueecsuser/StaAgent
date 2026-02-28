import org.junit.Test;
import static org.junit.Assert.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.sast.home.tools.sonar_clean_java_code.result_sonar_12.SingletonBeanBug;

public class SingletonBeanBugTest {

    @Test
    public void testShowBug() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SingletonBeanBug.class);
        SingletonBeanBug bean = context.getBean(SingletonBeanBug.class);

        // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        assertEquals(3, bean.showBug());  // Expected output: 3; Actual output: 2
    }
}