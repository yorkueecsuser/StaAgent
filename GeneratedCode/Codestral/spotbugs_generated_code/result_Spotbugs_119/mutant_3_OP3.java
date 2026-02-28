class DoubleBitsBug {

    public double showBug(int input) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code
            int temp = 10 / 0; // This will throw an ArithmeticException to ensure the code is truly unreachable
        }
        double result = Double.longBitsToDouble(input); // Original bug remains: DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT
        return result;
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}