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

// Mutated Code
class NullableInjectedFieldsExampleMutant {

    // Simulating Spring's @Value annotation behavior
    private static String getPropertyValue(String key, String defaultValue) {
        // Mimicking a scenario where the property might not be defined
        Properties properties = System.getProperties();
        return properties.getProperty(key, defaultValue);
    }
    
    // Renaming the variable 'importantProperty' to 'a' as part of mutation
    private String a;

    public NullableInjectedFieldsExampleMutant() {
        // Simulating @Value annotation injection without providing a default value
        this.a = getPropertyValue("app.importantProperty", null); // BUG: Nullable injected fields and parameters should provide a default value
    }

    public void showBug() {
        if (a == null) {
            throw new RuntimeException("importantProperty is not provided and has no default value!");
        }
    }
    
    public static void main(String[] args) {
        NullableInjectedFieldsExampleMutant exampleMutant = new NullableInjectedFieldsExampleMutant();
        exampleMutant.showBug();
    }
}