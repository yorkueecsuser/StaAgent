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

        // Inserting an unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This block is intentionally left empty
            System.out.println("This is an unreachable block.");
        }
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

    // This method mimics a runtime-evaluated false condition
    private boolean getFalseCondition() {
        return System.currentTimeMillis() < 0; // This is always false at runtime
    }
}