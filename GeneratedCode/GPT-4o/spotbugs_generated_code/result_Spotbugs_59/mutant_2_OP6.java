class NullPointerBugDemo {

    public String showBug(String input) {
        String result = null;
        if (input != null && input.length() > 5) {
            result = "Long enough";
        }
        
        // Insert an unreachable for loop based on the mutation operator
        boolean conditionFor = getLoopCondition(); // Dynamically determined condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable for loop");
        }
        
        // Here we assume that the input length is not more than 5, so result remains null.
        if (input != null && input.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return result.toUpperCase(); // If result is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }
    
    // A method to return false to make the loop unreachable
    private boolean getLoopCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}