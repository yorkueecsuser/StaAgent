class StringComparisonBug {

    public boolean showBug(String s) {
        return s == "one"; // BUG: UseEqualsToCompareStrings

        // Inserted unreachable if-else statement
        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("This will never be printed because shouldRun is always false.");
        } else {
            System.out.println("This will also never be printed because shouldRun is always false.");
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is dynamically determined at runtime
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}