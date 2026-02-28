import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Qualifier;

@Configuration
class MyConfiguration {

    @Bean
    @Qualifier("myService") // BUG: "@Qualifier" should not be used on "@Bean" methods
    public MyService myService() {
        return new MyService();
    }

    @Bean
    @Qualifier("betterService") // BUG: "@Qualifier" should not be used on "@Bean" methods
    public MyService aBetterService() {
        return new MyService();
    }

    @Bean
    @Qualifier("evenBetterService") // BUG: "@Qualifier" should not be used on "@Bean" methods
    public MyService anEvenBetterService() {
        return new MyService();
    }

    @Bean
    @Qualifier("differentService") // BUG: "@Qualifier" should not be used on "@Bean" methods
    public MyBean aDifferentService() {
        return new MyBean();
    }

    public String showBug() {
        return "This configuration demonstrates the bug where @Qualifier is incorrectly used on @Bean methods.";
    }
}

class MyService {}

class MyBean {}