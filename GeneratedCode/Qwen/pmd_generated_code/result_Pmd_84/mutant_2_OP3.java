class StringComparisonBug {

    public boolean showBug(String s) {
        // Original code
        return s == "one"; // BUG: UseEqualsToCompareStrings

        // Inserted unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable statement");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}