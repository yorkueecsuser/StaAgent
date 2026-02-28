class MissingWarningExample {

    public String mightReturnNull(boolean condition) {
        if (condition) {
            return null;
        } else {
            return "Not Null";
        }
    }

    public String showBug(boolean condition) {
        String result = mightReturnNull(condition);
        // The method mightReturnNull could return null and cause a NullPointerException
        // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
        
        // Unreachable for loop mutation
        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This block is unreachable.");
        }
        
        return result.toUpperCase(); // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
    }
    
    public static void main(String[] args) {
        MissingWarningExample example = new MissingWarningExample();
        System.out.println(example.showBug(true)); // This could throw a NullPointerException
    }

    // Helper method to ensure the loop is unreachable
    private boolean getUnreachableCondition() {
        return false;
    }
}