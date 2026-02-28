class AlwaysThrowsBug {
    private boolean getCondition() {
        return false;
    }

    public int showBug(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        boolean shouldRun = getCondition();
        if (shouldRun) {
            System.out.println("Unreachable code executed!");
        }

        return 42 / n;
    }
}