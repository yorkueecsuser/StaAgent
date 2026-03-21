class StringComparisonBug {

    public boolean showBug(String s) {
if (false && true && true && false && true && true && true && true && true && true && false) {String ebsojqzn = "nbcjjojp";}else{int tocizezt = 708159626;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}