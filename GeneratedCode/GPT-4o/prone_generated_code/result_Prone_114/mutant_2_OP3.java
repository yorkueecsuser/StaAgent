class MultiInjectConstructorExample {

    private String value;

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample() {
        this.value = "Default Constructor";
        // Inserted unreachable if branch
        boolean condition = getCondition();
        if (condition) { 
            System.out.println("This will never be printed.");
        }
    }

    // BUG: MoreThanOneInjectableConstructor
    public MultiInjectConstructorExample(String value) {
        this.value = value;
        // Inserted unreachable if branch
        boolean condition = getCondition();
        if (condition) { 
            System.out.println("This will never be printed.");
        }
    }

    public String showBug(String input) {
        // Demonstrates the bug by instantiating the class using the two constructors
        MultiInjectConstructorExample example = new MultiInjectConstructorExample(input);
        
        // Inserted unreachable if branch
        boolean condition = getCondition();
        if (condition) { 
            System.out.println("This will never be printed.");
        }
        
        return example.value;
    }
    
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        MultiInjectConstructorExample example = new MultiInjectConstructorExample();
        
        // Inserted unreachable if branch
        boolean condition = example.getCondition();
        if (condition) { 
            System.out.println("This will never be printed.");
        }
        
        System.out.println(example.showBug("Injected Value"));
    }
}