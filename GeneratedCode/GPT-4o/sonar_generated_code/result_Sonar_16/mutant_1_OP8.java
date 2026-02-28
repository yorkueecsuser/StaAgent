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
class NullableInjectedFieldsExampleMutant {

    // Simulating Spring's @Value annotation behavior
    private static String getPropertyValue(String key, String defaultValue) {
        // Mimicking a scenario where the property might not be defined
        Properties properties = System.getProperties();
        return properties.getProperty(key, defaultValue);
    }
    
    private String x; // Renamed variable

    public NullableInjectedFieldsExampleMutant() {
        // Simulating @Value annotation injection without providing a default value
        this.x = getPropertyValue("app.importantProperty", null); // BUG: Nullable injected fields and parameters should provide a default value
    }

    public void showBug() {
        if (x == null) { // Updated to renamed variable
            throw new RuntimeException("importantProperty is not provided and has no default value!");
        }
    }
    
    public static void main(String[] args) {
        NullableInjectedFieldsExampleMutant exampleMutant = new NullableInjectedFieldsExampleMutant();
        exampleMutant.showBug();
    }
}