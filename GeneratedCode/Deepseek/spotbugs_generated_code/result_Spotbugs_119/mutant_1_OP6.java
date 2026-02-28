class DoubleBitsBug {

    public boolean getFalseCondition() {
        return false; // Dummy method to return false
    }

    public double showBug(int input) {
        boolean condition = getFalseCondition();
        for (int i = 0; condition; i++) { // Mutation: Unreachable for loop
            System.out.println("This line will never execute.");
        }
        double result = Double.longBitsToDouble(input); // BUG: DMI: Double.longBitsToDouble invoked on an int (DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT)
        return result;
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}