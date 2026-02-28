class StringComparisonBug {

    public boolean showBug(String s) {
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
        }
        
        return s == "one"; // BUG: UseEqualsToCompareStrings
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }

    private boolean getCondition() {
        // This method always returns false, making the while loop unreachable
        return false;
    }
}