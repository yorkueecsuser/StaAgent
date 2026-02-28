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

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringComparisonExample example = new StringComparisonExample();

        // Unreachable while loop inserted as a mutant
        boolean conditionWhile = example.getFalseCondition();
        while (conditionWhile) {
            System.out.println("This is an unreachable code block.");
        }

        System.out.println(example.showBug("example")); // Output may vary depending on interning
        System.out.println(example.showBug(new String("example"))); // Usually false due to different memory references
    }
}