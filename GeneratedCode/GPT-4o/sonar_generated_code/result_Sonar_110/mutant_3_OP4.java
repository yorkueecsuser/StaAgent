class NullPointerExample {

    public String showBug(String input) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This is an unreachable code block.");
        } else {
            System.out.println("This is also an unreachable code block.");
        }
        
        return result;
    }

    private boolean getFalseCondition() {
        return false; // The condition is always false
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
}