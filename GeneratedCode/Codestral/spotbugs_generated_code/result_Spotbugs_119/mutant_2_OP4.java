class DoubleBitsBug {

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input);

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This code should never be executed");
        } else {
            // This code should always be executed
            // No changes needed here
        }

        return result;
    }

    // The main function and other methods remain unchanged
    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}