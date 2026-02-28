class NullPointerBugDemo {
    
    public String showBug(String input) {
        String result = null;
        if (input != null && input.length() > 5) {
            result = "Long enough";
        }

        // Unreachable if statement mutation
        boolean unreachableCondition = getUnreachableCondition(); // This method ensures the condition is always false
        if (unreachableCondition) {
            System.out.println("This line is unreachable");
        }
        
        // Here we assume that the input length is not more than 5, so result remains null.
        if (input != null && input.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return result.toUpperCase(); // If result is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }

    private boolean getUnreachableCondition() {
        return false; // This ensures the condition is always false at runtime, avoiding unreachable statement error
    }

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}