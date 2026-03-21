class StringComparisonBug {

    public boolean showBug(String s) {
for  (int blojazij = 0; blojazij < 0; blojazij++) {short dibcgotq = -8356;}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}