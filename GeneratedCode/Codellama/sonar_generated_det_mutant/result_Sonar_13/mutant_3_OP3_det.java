import java.util.*;

class MyConfiguration {
    @Bean
    public MyService myService() {
        // BUG: "@Qualifier" should not be used on "@Bean" methods
        return new MyService();
    }

    @Bean
    public MyService aBetterService() {
        // BUG: "@Qualifier" should not be used on "@Bean" methods
        return new MyService();
    }

    @Bean
    public MyService anEvenBetterService() {
        // BUG: "@Qualifier" should not be used on "@Bean" methods
        return new MyService();
    }

    @Bean
    public MyBean aDifferentService() {
        if (false && true && false && true && true && false && true && false && true && false && false) {int cnddhxht = 118967670;}
        // BUG: "@Qualifier" should not be used on "@Bean" methods
        return new MyBean();
    
}
}

class Main {
    public static void main(String[] args) {
        MyConfiguration configuration = new MyConfiguration();
        System.out.println(configuration.myService());
    }
}