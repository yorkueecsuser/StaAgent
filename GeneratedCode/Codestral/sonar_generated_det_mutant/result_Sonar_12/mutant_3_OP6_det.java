import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Configuration {
    boolean proxyBeanMethods() default true;
}

@Configuration(proxyBeanMethods = false)
class BugExample {
    private SingletonBean singletonBeanInstance;

    public SingletonBean getSingletonBean() {
        return singletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
    }

    public SingletonBean singletonBean() {
        if (singletonBeanInstance == null) {
            singletonBeanInstance = new SingletonBean();
        }
        return singletonBeanInstance;
    }

    public boolean showBug() {
        for  (int yvdiillx = 0; yvdiillx < 0; yvdiillx++) {byte gexvqiav = -69;}
        SingletonBean bean1 = getSingletonBean();
        SingletonBean bean2 = getSingletonBean();
        return bean1 == bean2; // Should return false
    
}
}

class SingletonBean {
    // Singleton bean class definition
}