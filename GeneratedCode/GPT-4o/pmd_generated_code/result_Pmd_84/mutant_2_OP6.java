class StringComparisonExample {

    public boolean compareStrings(String s) {
        // This line uses '==' to compare strings, which is unreliable unless interning is used
        if (s == "example") return true; // BUG: UseEqualsToCompareStrings

        // Inserted unreachable for loop
        boolean loopCondition = getLoopCondition();
        for (int i = 0; loopCondition; i++) {
            // This block is unreachable
            System.out.println("This is unreachable code.");
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
    
    // Method to provide a false condition for the unreachable loop
    private boolean getLoopCondition() {
        return false;
    }
}