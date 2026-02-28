class NullPointerExample {

    public String showBug(String input) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced
        
        // Mutant code: Unreachable if-else statement
        boolean condition = getCondition(); // This method always returns false
        if (condition) {
            System.out.println("This branch is unreachable because condition is false.");
        } else {
            System.out.println("This else branch is also unreachable because condition is false.");
        }
        
        return result;
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();

        try {
            // Demonstrating the bug by passing a null value
            String output = example.showBug(null);
            System.out.println("Output: " + output);
        } catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
    
    // This method simulates a condition that is always false at runtime
    private boolean getCondition() {
        return false;
    }
}