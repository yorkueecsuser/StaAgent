class StringComparisonExample {

    public boolean compareStrings(String s) {
        // This line uses '==' to compare strings, which is unreliable unless interning is used
        if (s == "example") return true; // BUG: UseEqualsToCompareStrings
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

        // Introduce an unreachable if statement using a dynamic condition
        boolean runtimeCondition = getFalseCondition();
        if (runtimeCondition) {
            System.out.println("This will never be printed.");
        }
    }

    // Method to return a false boolean value, ensuring the condition is dynamically determined at runtime
    private static boolean getFalseCondition() {
        return false;
    }
}