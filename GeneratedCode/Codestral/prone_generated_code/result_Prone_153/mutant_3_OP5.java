class EvenArgumentsMethod {
    public int getFalseValue() {
        return 0;
    }

    public void showBug(String... args) {
        if (args.length % 2!= 0) {
            throw new IllegalArgumentException("Method must be called with an even number of arguments"); // BUG: ShouldHaveEvenArgs
        }

        int value = getFalseValue();
        switch (value) {
            case 1:
                // This code is unreachable
                break;
        }

        // Process the arguments in pairs
    }
}