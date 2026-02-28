import org.junit.Test;
import static org.junit.Assert.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNamingBugTest {

    @Test
    public void testBugTrigger() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DifferentNamedBeansConfig.class);
        context.refresh();
        BeanNamingBug beanNamingBug = context.getBean(BeanNamingBug.class);
        assertNotEquals("bean1", beanNamingBug.showBug()); // TRIGGER BUG: Beans in "@Configuration" class should have different names
    }

    @org.springframework.context.annotation.Configuration
    static class DifferentNamedBeansConfig {

        @org.springframework.context.annotation.Bean(name = "bean1")
        public BeanNamingBug beanNamingBug1() {
            return new BeanNamingBug();
        }

        @org.springframework.context.annotation.Bean(name = "bean2")
        public BeanNamingBug beanNamingBug2() {
            return new BeanNamingBug();
        }
    }
}