class AlwaysThrowsBug {
    private int getUnreachableValue() {
        return -1;
    }

    public int showBug(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative"); // BUG: AlwaysThrows
        }

        // MUTANT CODE: Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be executed.");
                break;
            default:
                break;
        }

        return 42 / n; // This will throw ArithmeticException if n is 0
    }
}