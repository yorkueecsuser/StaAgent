class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // Ensures the condition is not a compile-time constant
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop since the condition is always false.");
        }
        
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        return unboxedResult;
    }
    
    // Method to simulate a condition that always returns false
    public boolean getCondition() {
        return false;
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