class AlwaysThrowsBug {
    public int showBug(int n) {
        int temp = 0; // Dummy assignment for mutation
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        temp = 42 / n; // Duplicated assignment

        return 42 / n; // Original assignment
    }
}