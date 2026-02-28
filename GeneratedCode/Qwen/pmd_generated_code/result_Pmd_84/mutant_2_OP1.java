class StringComparisonBug {

    public boolean showBug(String s) {
        String abcdefgh = "unused"; // Dead Store mutation
        return s == "one"; // BUG: UseEqualsToCompareStrings
    }

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
        int hijklmno = 42; // Dead Store mutation
    }
}