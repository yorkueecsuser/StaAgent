class DoubleBitsBug {

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input); // Original bug: DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT

        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) { // Unreachable switch statement
            case 0:
                System.out.println("This case should never be reached.");
                break;
            default:
                break;
        }

        return result;
    }

    public int getUnreachableValue() {
        return -1; // Always return a value that is not 0 to make the switch unreachable.
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}