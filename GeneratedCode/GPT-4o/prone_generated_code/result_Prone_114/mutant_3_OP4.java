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

        // Introduce unreachable if-else statement
        boolean condition = getCondition(); // This should be false to make the branch unreachable
        if (condition) {
            System.out.println("This is an unreachable if statement");
        } else {
            System.out.println("This code always runs");
        }

        return example.value;
    }

    private boolean getCondition() {
        return false; // Simulating a condition that is always false
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}