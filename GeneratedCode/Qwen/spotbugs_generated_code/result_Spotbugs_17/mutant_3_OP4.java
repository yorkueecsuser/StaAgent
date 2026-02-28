class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This is an unreachable block because shouldRun is always false
            System.out.println("This is an unreachable block");
        } else {
            // This block will always execute
            System.out.println("This block will always execute");
        }
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    private boolean getCondition() {
        return false; // This method ensures that the condition is dynamically determined at runtime
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