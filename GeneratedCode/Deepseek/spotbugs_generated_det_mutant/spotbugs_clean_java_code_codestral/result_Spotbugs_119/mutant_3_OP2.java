class DoubleBitsBug {

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input); // Original bug
        double resultDuplicate = Double.longBitsToDouble(input); // Mutant code, duplicate of the bug
        return result;
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}