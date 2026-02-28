class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        
        // Mutation: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1: 
                System.out.println("This will never run.");
                break;
            default:
                System.out.println("Default case, still won't run.");
                break;
        }
        
        return unboxedResult;
    }
    
    // Mock method to ensure condition is determined at runtime
    private int getUnreachableValue() {
        return 2; // Value that doesn't match any case in the switch statement
    }

    public static void main(String[] args) {
        NullTernaryExample example = new NullTernaryExample();
        try {
            System.out.println("Result: " + example.showBug(false)); // This will demonstrate the bug
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException as expected when trying to unbox null.");
        }
    }
}