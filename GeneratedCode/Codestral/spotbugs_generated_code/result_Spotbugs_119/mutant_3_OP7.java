class DoubleBitsBug {

    private boolean getFalseCondition() {
        return false;  // Method to return a hardcoded false value
    }

    public double showBug(int input) {
        boolean unreachableConditionWhile = getFalseCondition();
        while (unreachableConditionWhile) {   // Unreachable while loop
            System.out.println("This line will never execute");
        }
        double result = Double.longBitsToDouble(input); // Original bug is still present
        return result;
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}