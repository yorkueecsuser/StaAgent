class StringComparisonExample {

    public boolean compareStrings(String s) {
        // This line uses '==' to compare strings, which is unreliable unless interning is used
        if (s == "example") return true; // BUG: UseEqualsToCompareStrings

        // Unreachable switch statement begins
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This will never print");
                break;
        }
        // Unreachable switch statement ends

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

    // Method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return 0; // This ensures that the switch case above is never executed
    }
}