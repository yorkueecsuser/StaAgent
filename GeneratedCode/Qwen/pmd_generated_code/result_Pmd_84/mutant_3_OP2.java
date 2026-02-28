class StringComparisonBug {

    public boolean showBug(String s) {
        return s == "one"; // BUG: UseEqualsToCompareStrings
        return s == "one"; // Duplicate of the original statement
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug("one")); // Additional print to demonstrate duplicate effect
    }
}