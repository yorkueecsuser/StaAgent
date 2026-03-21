class IntComparisonBug {

    public boolean showBug(int intValue) {
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return intValue > 2147483648L; // This comparison is vacuously false because 2147483648L is outside the range of int
    }
public static void main(String [] args){
    IntComparisonBug bugDemo = new IntComparisonBug();
    bugDemo = new IntComparisonBug();
    System.out.println(bugDemo.showBug(1000));
    System.out.println(bugDemo.showBug(Integer.MAX_VALUE));
}
}