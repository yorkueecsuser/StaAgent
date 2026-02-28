// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // BUG: Nullable injected fields and parameters should provide a default value

    private boolean getFalseCondition() {
        return false; // This method will always return false
    }

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        if (getFalseCondition()) {
            // This block of code will never be executed since getFalseCondition() always returns false
            System.out.println("Unreachable code");
        }
        System.out.println(undefinedProperty); // This will throw a NullPointerException if the property is not defined
    }

    public String showBug() {
        if (getFalseCondition()) {
            // This block of code will never be executed since getFalseCondition() always returns false
            return "Unreachable code";
        }
        return undefinedProperty; // This will return null if the property is not defined
    }
}