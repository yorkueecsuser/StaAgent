class StringComparisonBug {

    public boolean showBug(String s) {
boolean zotwdhqq = false;while (zotwdhqq && true && false && false && true && true && false && true && true && true && false && false) {byte giroqfmg = 64;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}