class DoubleBitsBug {

    public boolean getUnreachableCondition() {
        return false;
    }

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)

        // Mutant: Inserting unreachable if branch
        if (getUnreachableCondition()) {
            System.out.println("This code is unreachable.");
        }

        return result;
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}