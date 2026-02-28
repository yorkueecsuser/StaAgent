class NullPointerExample {

    public String showBug(String input) {
        // Attempt to convert the input string to uppercase
        // This will throw a NullPointerException if 'input' is null
        String result = input.toUpperCase(); // BUG: Null pointers should not be dereferenced

        // Mutation: Unreachable while loop
        boolean conditionWhile = getCondition(); // Use a method to get the condition
        while (conditionWhile) {
            System.out.println("This is an unreachable loop.");
        }

        return result;
    }

    // Method to simulate a condition, always returns false to keep the loop unreachable
    private boolean getCondition() {
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