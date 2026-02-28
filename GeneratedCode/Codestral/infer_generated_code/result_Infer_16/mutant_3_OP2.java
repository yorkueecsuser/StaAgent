class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // BUG: INTEGER_OVERFLOW_L1
        int m_duplicate = n + 3; // Mutant: Duplication of the assignment statement
        return m;
    }
}