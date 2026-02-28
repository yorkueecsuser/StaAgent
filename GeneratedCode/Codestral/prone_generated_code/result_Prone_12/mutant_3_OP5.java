class BadShiftAmountBug {
    public int showBug(int number) {
        // BUG: BadShiftAmount
        int shiftedNumber = number >> 32; // Shift amount is out of range, should be between 0 and 31

        // Mutant: Unreachable switch statement
        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            int unreachableValue = 1;
            switch(unreachableValue) {
                case 1:
                    System.out.println("This code is unreachable");
                    break;
                default:
                    break;
            }
        }

        return shiftedNumber;
    }

    private boolean getCondition() {
        return false;
    }
}