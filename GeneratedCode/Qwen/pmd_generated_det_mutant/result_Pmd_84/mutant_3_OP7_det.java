class StringComparisonBug {

    public boolean showBug(String s) {
boolean pakienlt = false;while (pakienlt && true && false && true && true && false && true && false && true && false && false && false) {String tjdjggwu = "aoekkaeo";}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}