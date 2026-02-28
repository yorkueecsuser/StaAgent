class DoubleBitsBug {

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)

        // Mutant: Unreachable switch statement
        boolean isReachable = false;
        if (isReachable) {
            int switchVal = getSwitchValue();
            switch (switchVal) {
                case 1:
                    System.out.println("This line is unreachable");
                    break;
            }
        }

        return result;
    }

    private int getSwitchValue() {
        return 1;
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}