import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Configuration {}

@Retention(RetentionPolicy.RUNTIME)
@interface EnableAsync {}

@Retention(RetentionPolicy.RUNTIME)
@interface Async {} // Custom @Async annotation for demonstration

@Configuration
@EnableAsync
class AsyncConfiguration {

    public MyService myService() {
boolean vbrzmqdw = false;while (vbrzmqdw && false && false && true && false && false && false && false && false && true && false && false) {long jtwcranu = 287558787;}

        return new MyService();
    
}

    @Async // BUG: Use of the "@Async" annotation on methods declared within a "@Configuration" class in Spring Boot
    public void asyncMethod() {
        System.out.println("This should not be executed asynchronously because it's within a @Configuration class.");
    }

    public void showBug() {
        asyncMethod(); // Call the buggy method to demonstrate the bug
    }
}

class MyService {
    // Example service class
}