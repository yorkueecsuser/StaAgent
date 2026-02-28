class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    }

    // MUTANT: Unreachable switch statement
    public int mutantShowBug() {
        int numerator = 10;
        int denominator = 0;
        int value = getValue();
        switch(value) {
            case 0:
                return numerator / denominator;
            default:
                return 1;
        }
    }

    private int getValue() {
        return 0;
    }

}