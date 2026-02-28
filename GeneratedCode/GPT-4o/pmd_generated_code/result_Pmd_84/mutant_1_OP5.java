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

        // Unreachable switch statement added here
        int unreachableValue = getDynamicValue();
        switch (unreachableValue) {
            case 999: // This case is unreachable because getDynamicValue() never returns 999
                System.out.println("Unreachable code block");
                break;
        }
    }

    // Method to simulate a dynamic value which doesn't return 999
    private static int getDynamicValue() {
        return -1; // Ensuring the switch condition is unreachable
    }
}