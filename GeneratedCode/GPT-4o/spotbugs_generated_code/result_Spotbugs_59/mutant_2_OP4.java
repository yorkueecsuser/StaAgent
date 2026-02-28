class NullPointerBugDemo {

    public String showBug(String input) {
        String result = null;
        if (input != null && input.length() > 5) {
            result = "Long enough";
        }
        
        // Inserted unreachable if-else branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            result = "This will never be set";
        } else {
            // Original code remains unaffected
            if (input != null && input.length() <= 5) {
                // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
                return result.toUpperCase(); // If result is null, this will throw a NullPointerException
            }
        }
        
        return "Input was null or handled safely";
    }

    // Method to provide a non-final variable for condition
    private boolean getUnreachableCondition() {
        return false; // This ensures the condition is always false, making the branch unreachable
    }

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}