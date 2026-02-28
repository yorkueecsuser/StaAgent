class NullPointerExample {

    public String showBug(String input) {
        // Introduce a variable for the unreachable if-else statement
        boolean alwaysFalse = getFalseCondition();
        
        // Unreachable if-else statement
        if (alwaysFalse) {
            System.out.println("This block is unreachable and will never be executed.");
        } else {
            System.out.println("This else block is also a part of the unreachable if-else.");
        }

        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced
        return result;
    }

    // Helper method to return a false condition at runtime
    private boolean getFalseCondition() {
        return false;
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