class DoubleBitsBug {

    public double showBug(int input) {
        double result = Double.longBitsToDouble((long) input); // Original code
        int renamedVar = 10; // Mutant code: Renaming the variable 'input' to'renamedVar'
        double renamedResult = Double.longBitsToDouble((long) renamedVar); // Bug remains: DMI_LONG_BITS_TO_DOUBLE_INVOKED_ON_INT
        return result;
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}