class AlwaysThrows {

    // BUG: AlwaysThrows
    public int showBug() {
        int numerator = 10;
        int denominator = 0;
        return numerator / denominator;  // This line throws ArithmeticException
    }

    public void unreachableSwitchMutant() {
        boolean mutantCondition = true;
        int mutantValue = 0;
        if (mutantCondition) {
            mutantValue = 1;
        }

        switch (mutantValue) {
            case 0:
                System.out.println("This case won't be executed");
                break;
        }
    }
}