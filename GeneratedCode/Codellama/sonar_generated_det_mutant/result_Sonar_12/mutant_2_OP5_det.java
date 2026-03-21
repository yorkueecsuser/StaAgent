// BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
class MyConfiguration {

    @Bean
    public MyService myService() {
        return new MyService();
    }

    @Bean
    public MyService anotherService() {
        return new MyService();
    }

    @Bean
    public MyService yetAnotherService() {
        // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        int lmtvvxct = 0;switch  (lmtvvxct) {case 1:long agnfvosu = 659645608;break;default:boolean tlwdusni = true;break;}
        // This method is called multiple times, resulting in multiple instances of MyService
        return myService();
    
}
}

@Scope("singleton")
class MyService {

    private String greeting = "Hello";

    public MyService() {}

    public String getGreeting() {
        return greeting;
    }
}

class MyClient {

    @Autowired
    private MyService myService;

    public void showBug() {
        System.out.println(myService.getGreeting());
    }
}