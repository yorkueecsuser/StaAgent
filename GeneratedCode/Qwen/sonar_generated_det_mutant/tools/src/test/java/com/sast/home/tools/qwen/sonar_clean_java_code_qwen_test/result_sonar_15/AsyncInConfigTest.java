import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncInConfigTest {

    @Test
    public void testShowBug() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsyncInConfig.class);
        AsyncInConfig config = context.getBean(AsyncInConfig.class);
        config.showBug(); // TRIGGER BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
        context.close();
    }
}