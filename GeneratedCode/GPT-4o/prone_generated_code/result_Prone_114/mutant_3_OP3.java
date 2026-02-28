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

        // Inserting an unreachable if statement
        boolean isUnreachable = calculateUnreachableCondition();
        if (isUnreachable) {
            // This block is unreachable
            return "This block is unreachable";
        }

        return example.value;
    }

    private boolean calculateUnreachableCondition() {
        // A method to ensure the condition is always false at runtime
        return false;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}