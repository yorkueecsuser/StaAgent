class StringComparisonBug {

    public boolean showBug(String s) {
for  (int tvimmiiz = 0; tvimmiiz < 0; tvimmiiz++) {double mgzmdzfe = -810975016;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}