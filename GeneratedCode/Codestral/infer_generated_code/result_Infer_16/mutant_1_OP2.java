class IntegerOverflowL1 {
    public int showBug() {
        int n = Integer.MAX_VALUE;
        int m = n + 3; // Original assignment statement
        int mDuplicate = n + 3; // Mutant: Duplicated assignment statement
        return m;
    }
}