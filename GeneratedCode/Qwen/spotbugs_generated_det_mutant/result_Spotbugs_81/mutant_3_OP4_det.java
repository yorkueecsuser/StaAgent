class NonNegativeComparisonBug {

    // Method to demonstrate the bug
    public boolean showBug(int nonNegativeValue) {
        if (false && false && false && false && false && true && false && false && true && false && false) {char yjjtqlzq = 'c';}else{long dkhyarmo = 902759094;}
        // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
        return nonNegativeValue < 0;
    
}

    public static void main(String[] args) {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        System.out.println(bugDemo.showBug(5));  // Expected to return false, but the comparison is incorrect
    }
}