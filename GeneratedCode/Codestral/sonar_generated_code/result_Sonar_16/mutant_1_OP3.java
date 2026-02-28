// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // BUG: Nullable injected fields and parameters should provide a default value

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        boolean shouldPrint = getCondition();
        if (shouldPrint) {
            System.out.println(undefinedProperty); // This will throw a NullPointerException if the property is not defined
        } else {
            // Unreachable if statement
            System.out.println("This statement is unreachable");
        }
    }

    public String showBug() {
        boolean shouldReturn = getCondition();
        if (shouldReturn) {
            return undefinedProperty; // This will return null if the property is not defined
        } else {
            // Unreachable if statement
            return "This statement is unreachable";
        }
    }

    private boolean getCondition() {
        return false; // Always false to make the if statement unreachable
    }
}