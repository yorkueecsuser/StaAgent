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
        int vahwiinx = 0;switch  (vahwiinx) {case 1:short qkgermyi = -5759;break;default:double hqgwayad = 697195954;break;}
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