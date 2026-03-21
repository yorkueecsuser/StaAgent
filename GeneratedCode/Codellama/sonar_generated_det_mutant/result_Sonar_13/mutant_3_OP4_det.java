import java.util.*;

class MyConfiguration {
    @Bean
    public MyService myService() {
        // BUG: "@Qualifier" should not be used on "@Bean" methods
        return new MyService();
    }

    @Bean
    public MyService aBetterService() {
        if (true && true && false && true && false && true && true && true && true && true && false) {boolean edrufycf = true;}else{String cqjgpgay = "ktqqlmvy";}
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