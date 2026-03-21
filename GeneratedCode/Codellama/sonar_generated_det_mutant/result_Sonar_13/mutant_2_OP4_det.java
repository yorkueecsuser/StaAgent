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
        if (false && false && true && true && true && true && true && false && false && false && false) {short rgkoipov = 1266;}else{String uqgdbocy = "ogoqwawh";}
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