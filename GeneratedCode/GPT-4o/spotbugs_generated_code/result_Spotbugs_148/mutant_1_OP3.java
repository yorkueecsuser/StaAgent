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
        
        // Introducing an unreachable if statement
        boolean unreachable = getFalseCondition();
        if (unreachable) {
            return "This is unreachable";
        }
        
        return result.toUpperCase(); // BUG: FB: Missing expected or desired warning from SpotBugs (FB_MISSING_EXPECTED_WARNING)
    }
    
    private boolean getFalseCondition() {
        return false;
    }
    
    public static void main(String[] args) {
        MissingWarningExample example = new MissingWarningExample();
        System.out.println(example.showBug(true)); // This could throw a NullPointerException
    }
}