class AlwaysThrowsBug {
    public int showBug(int n) {
        boolean isFalse = false;
        int value = 0;

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        // Mutant: Unreachable switch statement
        switch (value) {
            case 1:
                isFalse = true; // This code will never be executed
                break;
        }

        return 42 / n; // This will throw ArithmeticException if n is 0
    }
}