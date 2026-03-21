class StringComparisonBug {

    public boolean showBug(String s) {
if (false && true && true && false && false && true && true && true && true && false && false) {String elyzqpgq = "hdwhtwlw";}else{char khokammk = 'l';}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}