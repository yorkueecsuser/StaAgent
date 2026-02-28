class NullPointerExample {

    public String showBug(String input) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced
        
        // Unreachable if statement
        boolean unreachableCondition = alwaysFalse();
        if (unreachableCondition) {
            // This block will never be executed
            System.out.println("This is an unreachable block of code.");
        }

        return result;
    }

    // Method to ensure the condition is determined at runtime
    private boolean alwaysFalse() {
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