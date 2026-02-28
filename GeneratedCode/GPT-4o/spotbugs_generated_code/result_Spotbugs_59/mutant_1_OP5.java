class NullPointerBugDemo {

    public String showBug(String input) {
        String result = null;
        if (input != null && input.length() > 5) {
            result = "Long enough";
        }

        // Unreachable switch statement introduced here
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never be executed.");
                break;
            default:
                break;
        }
        
        // Here we assume that the input length is not more than 5, so result remains null.
        if (input != null && input.length() <= 5) {
            // BUG: NP: Possible null pointer dereference (NP_NULL_ON_SOME_PATH)
            return result.toUpperCase(); // If result is null, this will throw a NullPointerException
        }
        
        return "Input was null or handled safely";
    }

    // Method to simulate an unreachable value for the switch
    private int getUnreachableValue() {
        return 0; // Ensures that none of the case statements in the switch are executed
    }

    public static void main(String[] args) {
        NullPointerBugDemo demo = new NullPointerBugDemo();
        System.out.println(demo.showBug("test")); // Triggers the bug
    }
}