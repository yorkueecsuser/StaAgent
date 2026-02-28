class StringComparisonExample {

    public boolean compareStrings(String s) {
        // This line uses '==' to compare strings, which is unreliable unless interning is used
        if (s == "example") return true; // BUG: UseEqualsToCompareStrings
        
        // Unreachable if statement mutation
        boolean condition = getCondition(); // Ensures the condition is dynamic and not a constant
        if (condition) {
            // Unreachable code
            System.out.println("This line will never be executed.");
        }
        
        return false;
    }

    public boolean compareStringsProperly(String s) {
        // This method demonstrates the proper way to compare strings
        return "example".equals(s);
    }

    public boolean showBug(String input) {
        // Demonstrates the unreliable behavior using the buggy method
        return compareStrings(input);
    }

    public static void main(String[] args) {
        StringComparisonExample example = new StringComparisonExample();

        System.out.println(example.showBug("example")); // Output may vary depending on interning
        System.out.println(example.showBug(new String("example"))); // Usually false due to different memory references
    }

    // Helper method to ensure the condition is dynamic and not a compile-time constant
    private boolean getCondition() {
        return false; // Always returns false, making the if statement unreachable
    }
}