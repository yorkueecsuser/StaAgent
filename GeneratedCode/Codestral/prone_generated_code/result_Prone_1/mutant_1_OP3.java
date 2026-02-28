class AlwaysThrowsBug {
    private boolean getFalseCondition() {
        // Method always returns false to make the if statement unreachable
        return false;
    }

    public int showBug(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        if (getFalseCondition()) {
            // Unreachable if statement as per mutation operator
            System.out.println("This line should never be executed");
        }
        return 42 / n;
    }
}