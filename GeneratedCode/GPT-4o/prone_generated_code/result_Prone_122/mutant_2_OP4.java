class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        
        // Insertion of an unreachable if-else statement
        // Use a method to dynamically determine the condition at runtime
        if (isConditionTrue()) {
            System.out.println("This will never print because the condition is false.");
        } else {
            System.out.println("This is the else block of an unreachable if-else statement.");
        }
        
        return unboxedResult;
    }
    
    private boolean isConditionTrue() {
        // This method always returns false to make the if block unreachable
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