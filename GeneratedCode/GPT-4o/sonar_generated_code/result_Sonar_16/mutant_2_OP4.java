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

        // Mutation: Inserting an unreachable if-else statement
        boolean isConditionFalse = getCondition(); // Ensures dynamic evaluation to avoid compile-time constant
        if (isConditionFalse) {
            System.out.println("This branch is unreachable.");
        } else {
            System.out.println("This branch is also unreachable and doesn't affect the program.");
        }
    }

    private boolean getCondition() {
        return false; // The condition is always false at runtime
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