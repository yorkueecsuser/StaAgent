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
        
        // Introduce an unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable due to the condition being always false
            System.out.println("This line will never be executed.");
        } else {
            // Normal execution continues here
            return example.value;
        }
        return "This line will never be returned.";
    }
    
    // A method to simulate a condition that is always false
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}