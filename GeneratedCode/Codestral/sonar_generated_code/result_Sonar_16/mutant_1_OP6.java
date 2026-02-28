// Import removed because it's not necessary and it's not allowed by the import requirements

// Annotation removed because it's from spring framework and it's not allowed by the import requirements
class ConfigurableComponent {

    private String undefinedProperty; // BUG: Nullable injected fields and parameters should provide a default value

    private boolean getCondition() { // Method to ensure dynamic condition
        return false;
    }

    // Annotation removed because it's from spring framework and it's not allowed by the import requirements
    public void init() {
        for (int i = 0; getCondition(); i++) { // Inserted unreachable for loop
            System.out.println(i);
        }
        System.out.println(undefinedProperty); // This will throw a NullPointerException if the property is not defined
    }

    public String showBug() {
        return undefinedProperty; // This will return null if the property is not defined
    }
}