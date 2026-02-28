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

        // Unreachable switch statement mutation
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                // This case will never be executed
                System.out.println("Unreachable case 1");
                break;
            case 2:
                // This case will never be executed
                System.out.println("Unreachable case 2");
                break;
            default:
                // Default case that will also not be executed
                System.out.println("Unreachable default case");
                break;
        }

        return example.value;
    }

    // A method to ensure the unreachable switch statement
    private int getUnreachableSwitchValue() {
        return 100; // Returns a value not covered by any switch case
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}