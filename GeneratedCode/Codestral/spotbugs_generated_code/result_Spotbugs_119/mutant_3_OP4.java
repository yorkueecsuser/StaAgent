class DoubleBitsBug {

    private boolean getUnreachableCondition() {
        return false;
    }

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input); // Original bug

        // Mutated code
        if (getUnreachableCondition()) {
            // Unreachable if-else statement added
            System.out.println("Unreachable code block executed.");
        } else {
            System.out.println("Alternative unreachable code block executed.");
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