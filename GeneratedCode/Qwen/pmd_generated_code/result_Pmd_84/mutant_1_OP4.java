class StringComparisonBug {

    public boolean showBug(String s) {
        // Original code
        return s == "one"; // BUG: UseEqualsToCompareStrings

        // Mutant code: Inserting an unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // This block will never be executed because condition is always false
            System.out.println("This is an unreachable if block.");
        } else {
            // This block will also never be executed because condition is always false
            System.out.println("This is an unreachable else block.");
        }
    }

    private boolean getCondition() {
        // Always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}