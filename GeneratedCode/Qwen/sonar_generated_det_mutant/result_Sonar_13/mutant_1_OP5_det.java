import java.lang.String;

class MyConfiguration {

    // BUG: "@Qualifier" should not be used on "@Bean" methods
    @Bean
    @Qualifier("myService") 
    public MyService myService() {
int meuzwqjy = 0;switch  (meuzwqjy) {case 1:float lbrxgzuj = 439851074;break;default:int bbdzljhn = 778406687;break;}

        return new MyService();
    
}

    // BUG: "@Qualifier" should not be used on "@Bean" methods
    @Bean
    @Qualifier("betterService") 
    public MyService aBetterService() {
        return new MyService();
    }

    // BUG: "@Qualifier" should not be used on "@Bean" methods
    @Bean
    @Qualifier("evenBetterService") 
    public MyService anEvenBetterService() {
        return new MyService();
    }

    // BUG: "@Qualifier" should not be used on "@Bean" methods
    @Bean
    @Qualifier("differentService") 
    public MyBean aDifferentService() {
        return new MyBean();
    }

    public String showBug() {
        return "This configuration demonstrates the incorrect usage of @Qualifier on @Bean methods.";
    }
}

class MyService {
    // Service implementation
}

class MyBean {
    // Bean implementation
}

@interface Bean {
    String name() default "";
}

@interface Qualifier {
    String value();
}

@Configuration
@interface Configuration {}