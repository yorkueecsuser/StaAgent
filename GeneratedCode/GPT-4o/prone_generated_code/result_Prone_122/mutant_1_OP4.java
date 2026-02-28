class NullTernaryExample {

    public Integer showBug(boolean flag) {
        Integer foo = 10;
        Integer result = flag ? foo : null; // BUG: NullTernary
        int unboxedResult = result; // This line will throw NullPointerException if result is null
        
        // Introduce a non-final variable for condition
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable because condition is always false.");
        } else {
            System.out.println("This is the else block of the unreachable if-else statement.");
        }
        
        return unboxedResult;
    }

    // Method to simulate dynamic condition, always returns false
    private boolean getCondition() {
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