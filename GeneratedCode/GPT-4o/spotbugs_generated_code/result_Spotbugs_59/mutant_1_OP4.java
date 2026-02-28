class NullPointerBugDemo {

    public String showBug(String input) {
        String result = null;
        if (input != null && input.length() > 5) {
            result = "Long enough";
        }

        // Unreachable if-else branch introduced
        boolean condition = getFalseCondition(); // Ensures condition is false at runtime
        if (condition) {
            result = "This will never be executed";
        } else {
            // Here we assume that the input length is not more than 5, so result remains null.
            if (input != null && input.length() <= 5) {
                // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
                return result.toUpperCase(); // If result is null, this will throw a NullPointerException
            }
        }

        return "Input was null or handled safely";
    }

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}