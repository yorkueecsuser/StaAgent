class AlwaysThrowsBug {
    public int showBug(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        return 42 / n;
        // Mutant code (duplicated assignment statement)
        return 42 / n;
    }
}