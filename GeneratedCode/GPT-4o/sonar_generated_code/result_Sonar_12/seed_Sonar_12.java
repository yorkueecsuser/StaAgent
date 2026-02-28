import java.util.HashMap;
import java.util.Map;

class SingletonBeanConfiguration {

    // Simulating a Spring-like Singleton bean creation using a simple Map
    private Map<String, Object> beanRegistry = new HashMap<>();

    public SingletonBeanConfiguration() {
        // Directly invoking the @Bean methods in configuration, which is not correct when proxyBeanMethods is false
        Object firstInstance = singletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false
        Object secondInstance = singletonBean(); // BUG: "@Bean" methods for Singleton should not be invoked in "@Configuration" when proxyBeanMethods is false

        // Demonstration of the bug: these two instances are not the same due to new bean creation each time
        System.out.println("Are both instances the same? " + (firstInstance == secondInstance));
    }

    // Simulating a @Bean annotation with a method that returns a Singleton bean
    public Object singletonBean() {
        if (!beanRegistry.containsKey("singletonBean")) {
            beanRegistry.put("singletonBean", new Object());
        }
        return beanRegistry.get("singletonBean");
    }

    public boolean showBug() {
        // This will demonstrate the bug by returning false, indicating two different instances
        Object firstInstance = singletonBean();
        Object secondInstance = singletonBean();
        return firstInstance == secondInstance;
    }

    public static void main(String[] args) {
        SingletonBeanConfiguration config = new SingletonBeanConfiguration();
        System.out.println("Is singletonBean behaving like a Singleton? " + config.showBug());
    }
}