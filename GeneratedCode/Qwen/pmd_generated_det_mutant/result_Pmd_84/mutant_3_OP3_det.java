class StringComparisonBug {

    public boolean showBug(String s) {
if (false && true && true && true && false && false && true && false && true && false && false) {double axxxfewr = 874849841;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}