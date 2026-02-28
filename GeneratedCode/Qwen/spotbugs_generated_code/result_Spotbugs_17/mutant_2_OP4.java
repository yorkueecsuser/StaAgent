class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        boolean shouldRun = getCondition(); // Dynamically determined condition
        if (shouldRun) {
            // Unreachable if-else statement
            if (input == null) {
                return "This is unreachable";
            } else {
                return "This is also unreachable";
            }
        }
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    // Method to simulate a dynamic condition
    private boolean getCondition() {
        return false; // This ensures the if-else block is unreachable
    }

    public static void main(String[] args) {
        NullPointerExample example = new NullPointerExample();
        try {
            System.out.println(example.showBug(null)); // This will throw a NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}