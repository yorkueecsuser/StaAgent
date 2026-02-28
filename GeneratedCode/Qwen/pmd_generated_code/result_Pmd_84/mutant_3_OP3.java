class StringComparisonBug {

    public boolean showBug(String s) {
        return s == "one"; // BUG: UseEqualsToCompareStrings

        // Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable statement");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}