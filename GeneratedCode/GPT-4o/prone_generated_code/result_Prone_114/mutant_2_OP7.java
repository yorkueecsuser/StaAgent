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
        
        // Introducing an unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This is unreachable");
        }
        
        return example.value;
    }

    // Method to provide a non-final variable for unreachable loop condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}