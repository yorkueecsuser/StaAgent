import java.util.Properties;

class NullableInjectedFieldsExample {

    // Simulating Spring's @Value annotation behavior
    private static String getPropertyValue(String key, String defaultValue) {
        // Mimicking a scenario where the property might not be defined
        Properties properties = System.getProperties();
        return properties.getProperty(key, defaultValue);
    }
    
    private String importantProperty;

    public NullableInjectedFieldsExample() {
        // Simulating @Value annotation injection without providing a default value
        this.importantProperty = getPropertyValue("app.importantProperty", null); // BUG: Nullable injected fields and parameters should provide a default value
    }

    public void showBug() {
        if (importantProperty == null) {
            throw new RuntimeException("importantProperty is not provided and has no default value!");
        }
    }
    
    public static void main(String[] args) {
        NullableInjectedFieldsExample example = new NullableInjectedFieldsExample();
        example.showBug();
    }
}

// Mutant Code
class MutantNullableInjectedFieldsExample {

    // Simulating Spring's @Value annotation behavior with renamed variables
    private static String getPropertyValue(String k, String d) {
        Properties props = System.getProperties();
        return props.getProperty(k, d);
    }
    
    private String a;

    public MutantNullableInjectedFieldsExample() {
        this.a = getPropertyValue("app.importantProperty", null);
    }

    public void showBug() {
        if (a == null) {
            throw new RuntimeException("a is not provided and has no default value!");
        }
    }
    
    public static void main(String[] args) {
        MutantNullableInjectedFieldsExample ex = new MutantNullableInjectedFieldsExample();
        ex.showBug();
    }
}