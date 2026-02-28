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
        
        // Unreachable switch statement mutation
        int unreachableValue = 2; // Ensure this is not a constant expression
        switch (unreachableValue) {
            case 3:
                System.out.println("This code is unreachable");
                break;
            default:
                // Do nothing
                break;
        }
        
        return result.toUpperCase(); // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
    }
    
    public static void main(String[] args) {
        MissingWarningExample example = new MissingWarningExample();
        System.out.println(example.showBug(true)); // This could throw a NullPointerException
    }
}