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
        
        // Unreachable for loop mutation implementation
        boolean conditionFor = getCondition(); // Using a dynamic condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never be printed.");
        }
        
        return example.value;
    }

    // Method to determine the condition at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}