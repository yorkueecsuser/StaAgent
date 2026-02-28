class MultiInjectConstructorExample {

    private String value;

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample() {
        this.value = "Default Constructor";
    }

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample(String value) {
        this.value = value;
    }

    public String showBug(String input) {
        // Demonstrates the bug by instantiating the class using the two constructors
        MultiInjectConstructorExample example = new MultiInjectConstructorExample(input);

        // Unreachable if-else branch added
        boolean condition = getCondition(); // This method determines the condition dynamically at runtime
        if (condition) {
            // This block will never execute as the condition is always generated to be false
            System.out.println("This block is intentionally unreachable.");
        } else {
            // Normal execution continues here
        }

        return example.value;
    }

    // Method to simulate a runtime condition that returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}