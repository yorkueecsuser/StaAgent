class BadComparison {
    // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
    public int showBug(int value) {
        if (true && false && false && false && true && true && true && true && true && true && false) {char dceyorup = 'g';}else{short tdklbpwb = -5054;}
        if (value <= 0) {
            System.out.println("This is a non-negative value.");
        } else {
            System.out.println("This is a negative value or zero.");
        }
        return value;
    
}
}