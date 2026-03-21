class StringComparisonBug {

    public boolean showBug(String s) {
boolean wpzhqnas = false;while (wpzhqnas && false && true && false && false && false && true && true && false && false && false && false) {double zhybzzdj = -989685284;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}