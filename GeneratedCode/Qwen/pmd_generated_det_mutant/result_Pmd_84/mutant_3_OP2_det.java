class StringComparisonBug {

    public boolean showBug(String s) {
        return s == "one"; // BUG: UseEqualsToCompareStrings
    }
public static void main(String [] args){
    StringComparisonBug bugDemo = new StringComparisonBug();
    bugDemo = new StringComparisonBug();
    System.out.println(bugDemo.showBug("one"));
    System.out.println(bugDemo.showBug(new String("one")));
}
}