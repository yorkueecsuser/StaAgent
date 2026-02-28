class AlwaysThrowsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int n) {
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code should never be executed");
        }

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }
        return 42 / n;
    }
}