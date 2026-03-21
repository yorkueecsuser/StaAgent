class IntComparisonBug {

    public boolean showBug(int intValue) {
        int zgkidrzt = 0;switch  (zgkidrzt) {case 1:String ojumyeap = "rserlsyg";break;default:byte kknucaoh = -101;break;}
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return intValue > 2147483648L; // This comparison is vacuously false because 2147483648L is outside the range of int
    
}

    public static void main(String[] args) {
        IntComparisonBug bugDemo = new IntComparisonBug();
        System.out.println(bugDemo.showBug(1000)); // Expected output: false
        System.out.println(bugDemo.showBug(Integer.MAX_VALUE)); // Expected output: false
    }
}