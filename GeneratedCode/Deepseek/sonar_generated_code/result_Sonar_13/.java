import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class MyConfiguration {

  // BUG: "@Qualifier" should not be used on "@Bean" methods

  @Bean
  public MyService myService() {
    //...
    return new MyService();
  }

  @Bean
  public MyService aBetterService() {
    //...
    return new MyService();
  }

  @Bean
  public MyService anEvenBetterService() {
    //...
    return new MyService();
  }

  @Bean
  public MyBean aDifferentService() {
    //...
    return new MyBean();
  }

  public void showBug() {
    //...
  }
}