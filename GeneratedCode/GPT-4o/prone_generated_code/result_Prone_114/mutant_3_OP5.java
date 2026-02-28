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
        int unreachableSwitchCondition = generateCondition();
        switch (unreachableSwitchCondition) {
            case 1:
                // Some code that will never execute
                System.out.println("Unreachable code");
                break;
            default:
                break;
        }
        
        return example.value;
    }

    private int generateCondition() {
        // This method will always return a value that does not match any case in the switch
        return 0; // Ensures that the switch statement is unreachable
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}