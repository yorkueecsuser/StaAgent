class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32;

        // MUTANT: Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line is unreachable");
                break;
        }

        return shiftedNumber;
    }

    // This method always returns a value that's not 1, making the switch statement unreachable
    private int getUnreachableValue() {
        return 2;
    }
}