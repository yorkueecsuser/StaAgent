import org.junit.Test;
import static org.junit.Assert.*;

// Necessary imports for Spring Boot context
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AsyncConfigTest {

    @Test
    public void testAsyncMethodExample() {
        // Initialize Spring context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AsyncConfig.class);
        AsyncConfig config = context.getBean(AsyncConfig.class);

        config.showBug(); // TRIGGER BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot

        context.close();
    }
}