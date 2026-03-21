import java.util.*;

class MyConfiguration {
    @Bean
    public MyService myService() {
        // BUG: "@Qualifier" should not be used on "@Bean" methods
        return new MyService();
    }

    @Bean
    public MyService aBetterService() {
        if (false && true && false && false && false && true && false && false && true && true && false) {float mbplrryt = -650928459;}
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