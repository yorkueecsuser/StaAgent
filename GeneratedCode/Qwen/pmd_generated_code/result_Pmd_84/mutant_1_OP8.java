class StringComparisonBug {

    public boolean showBug(String s) {
        return s == "one"; // BUG: UseEqualsToCompareStrings
    }

    public boolean showBug(String x) { // Mutant: Renamed parameter's' to 'x'
        return x == "one"; // BUG: UseEqualsToCompareStrings
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable

        StringComparisonBug bugDemoX = new StringComparisonBug();
        System.out.println(bugDemoX.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemoX.showBug(new String("one"))); // Expected: true, but unreliable
    }
}