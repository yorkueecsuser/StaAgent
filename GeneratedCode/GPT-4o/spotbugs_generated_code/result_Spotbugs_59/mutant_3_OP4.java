class NullPointerBugDemo {

    public String showBug(String input) {
        String result = null;
        if (input != null && input.length() > 5) {
            result = "Long enough";
        }
        
        // Unreachable if-else statement
        boolean shouldExecute = getCondition();
        if (shouldExecute) {
            // This block is unreachable since getCondition() always returns false
            System.out.println("This will never print.");
        } else {
            System.out.println("This is the else block of the unreachable if-else statement.");
        }
        
        // Here we assume that the input length is not more than 5, so result remains null.
        if (input != null && input.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return result.toUpperCase(); // If result is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }

    private boolean getCondition() {
        return false; // Ensures the if-else statement is unreachable
    }

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}