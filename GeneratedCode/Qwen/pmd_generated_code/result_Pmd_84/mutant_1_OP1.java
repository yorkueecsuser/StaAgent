class StringComparisonBug {

    public boolean showBug(String s) {
        String jhgfdsaz = "unused"; // Dead Store Mutation
        return s == "one"; // BUG: UseEqualsToCompareStrings
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        int vbnrhtyu = 10; // Dead Store Mutation
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}