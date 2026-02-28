class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        boolean condition = getCondition(); // Dynamically determined condition
        if (condition) { // Unreachable if statement
            System.out.println("This is an unreachable statement.");
        }
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined but always returns false
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