class MultiInjectConstructorExample {

    private String value;

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample() {
        this.value = "Default Constructor";
        
        // Unreachable for loop mutation
        boolean unreachableCondition = false; // This condition is set to false but not as a final variable
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This is unreachable for loop - Default Constructor");
        }
    }

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample(String value) {
        this.value = value;
        
        // Unreachable for loop mutation
        boolean unreachableCondition = false; // This condition is set to false but not as a final variable
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This is unreachable for loop - Parameterized Constructor");
        }
    }

    public String showBug(String input) {
        // Demonstrates the bug by instantiating the class using the two constructors
        MultiInjectConstructorExample example = new MultiInjectConstructorExample(input);
        return example.value;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        System.out.println(example.showBug("Injected Value"));
    }
}