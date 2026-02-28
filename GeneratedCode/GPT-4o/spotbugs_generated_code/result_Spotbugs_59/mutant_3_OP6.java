class NullPointerBugDemo {

    public String showBug(String input) {
        String result = null;
        
        // Unreachable for loop with a dynamic condition
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            System.out.println("This will never print");
        }
        
        if (input != null && input.length() > 5) {
            result = "Long enough";
        }
        
        // Here we assume that the input length is not more than 5, so result remains null.
        if (input != null && input.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return result.toUpperCase(); // If result is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }

    // Method to return a false condition for unreachable loop
    private boolean getUnreachableCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}