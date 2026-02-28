class StringComparisonBug {

    public boolean showBug(String s) {
        return s == "one"; // BUG: UseEqualsToCompareStrings

        // Introduced unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This block will never execute because shouldRun is always false
            System.out.println("This is an unreachable block");
        } else {
            // This block will also never execute for the same reason
            System.out.println("This is another unreachable block");
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}