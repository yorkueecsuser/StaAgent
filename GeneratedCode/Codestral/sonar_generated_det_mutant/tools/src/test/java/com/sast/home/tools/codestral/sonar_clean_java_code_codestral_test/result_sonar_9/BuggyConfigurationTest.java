import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BuggyConfigurationTest {

    @Test(expected = NoUniqueBeanDefinitionException.class)
    public void testShowBug() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BuggyConfiguration.class);
        BuggyConfiguration buggyConfiguration = context.getBean(BuggyConfiguration.class);
        buggyConfiguration.showBug("bean1"); // TRIGGER BUG: Beans in "@Configuration" class should have different names
    }
}