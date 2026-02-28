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

        // Unreachable switch statement insertion
        int unreachableSwitchCondition = getSwitchCondition(); // dynamically determined at runtime
        switch (unreachableSwitchCondition) {
            case 1:
                System.out.println("This will never be executed");
                break;
            default:
                // Default case can be used for cleanup or logging
                System.out.println("Default case executed for unreachable switch");
                break;
        }
    }

    public static int getSwitchCondition() {
        // This method can return a value that makes the switch unreachable
        return 0; // Adjust this dynamically to maintain the mutation effect
    }
}