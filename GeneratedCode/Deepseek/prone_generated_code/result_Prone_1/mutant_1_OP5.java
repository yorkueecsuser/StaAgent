class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    }

    public void unreachableSwitchStatement() {
        int value = getValue();
        switch (value) {
            default:
                break;
        }
    }

    private int getValue() {
        return 0;
    }
}