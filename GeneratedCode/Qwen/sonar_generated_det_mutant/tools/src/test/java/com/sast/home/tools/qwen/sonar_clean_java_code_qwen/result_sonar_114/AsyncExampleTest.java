import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;

@Configuration
@EnableAsync
class TestConfig {
    @Bean
    public AsyncExample asyncExample() {
        return new AsyncExample();
    }
}

public class AsyncExampleTest {

    @Test(expected = IllegalStateException.class)
    public void testPerformAsyncTaskFailsWhenNotPublic() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
        AsyncExample asyncExample = context.getBean(AsyncExample.class);
        asyncExample.showBug(); // TRIGGER BUG: Methods with Spring proxying annotations should be public
    }
}