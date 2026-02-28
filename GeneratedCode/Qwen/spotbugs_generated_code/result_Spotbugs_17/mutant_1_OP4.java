class NullPointerExample {

    // Method that demonstrates the bug
    public String showBug(String input) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block is reachable but does nothing unique
        } else {
            // This block is unreachable due to the condition always being true
        }
        return input.toUpperCase(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) 
    }

    private boolean getCondition() {
        // This method always returns true, making the else block unreachable
        return true;
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