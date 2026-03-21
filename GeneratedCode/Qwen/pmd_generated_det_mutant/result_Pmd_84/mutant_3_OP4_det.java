class StringComparisonBug {

    public boolean showBug(String s) {
if (false && true && false && true && true && false && true && true && false && false && false) {short tndlglzu = -4039;}else{String ztomxsfc = "ldwoiahd";}

        return s == "one"; // BUG: UseEqualsToCompareStrings
    
}

    public static void main(String[] args) {
        StringComparisonBug bugDemo = new StringComparisonBug();
        System.out.println(bugDemo.showBug("one")); // Expected: true, but unreliable
        System.out.println(bugDemo.showBug(new String("one"))); // Expected: true, but unreliable
    }
}