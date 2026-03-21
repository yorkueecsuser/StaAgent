class StringComparisonBug {

    public boolean showBug(String s) {
if (true && false && true && false && false && false && false && false && true && true && false) {char aemkwngf = 'v';}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}