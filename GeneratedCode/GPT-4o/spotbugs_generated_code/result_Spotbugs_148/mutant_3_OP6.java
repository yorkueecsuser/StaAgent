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
        // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition(); // Method call ensures non-constant condition
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line is unreachable");
        }

        return result.toUpperCase(); // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
    }
    
    private boolean getCondition() {
        return false; // This makes the for loop condition always false
    }

    public static void main(String[] args) {
        MissingWarningExample example = new MissingWarningExample();
        System.out.println(example.showBug(true)); // This could throw a NullPointerException
    }
}