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
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable code block inside a for loop.");
        }
    }

    public void showBug() {
        if (importantProperty == null) {
            throw new RuntimeException("importantProperty is not provided and has no default value!");
        }
    }

    // Method to ensure non-final variable usage for the unreachable for loop
    private boolean getCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        NullableInjectedFieldsExample example = new NullableInjectedFieldsExample();
        example.showBug();
    }
}