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
        for  (int mukytemf = 0; mukytemf < 0; mukytemf++) {short bxoxvbsl = -4950;}
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