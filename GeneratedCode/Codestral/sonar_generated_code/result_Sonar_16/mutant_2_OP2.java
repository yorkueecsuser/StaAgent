class ConfigurableComponent {

    private String undefinedProperty;

    public void init() {
        System.out.println(undefinedProperty);
        undefinedProperty = undefinedProperty; // Mutant: Duplicating the assignment statement
    }

    public String showBug() {
        undefinedProperty = undefinedProperty; // Mutant: Duplicating the assignment statement
        return undefinedProperty;
    }
}