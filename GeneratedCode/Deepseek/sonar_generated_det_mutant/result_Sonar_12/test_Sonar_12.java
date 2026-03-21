import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@RunWith(SpringJUnit4ClassRunner.class)
@Configuration
public class SingletonInConfigurationBugTest {

    @Autowired
    private SingletonInConfigurationBug instance;

    @Test
    public void testShowBug() {
        String bug = instance.showBug();
        // TRIGGER BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        assertNotNull(bug); // This will fail because the bug is not triggered because it should not be invoked in a @Configuration class.
    }
}