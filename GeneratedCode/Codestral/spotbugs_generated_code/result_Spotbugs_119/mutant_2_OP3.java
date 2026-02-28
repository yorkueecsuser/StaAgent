class DoubleBitsBug {

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input); // Original bug

        boolean condition = getCondition();
        if (condition) {
            // Unreachable if statement with mutated code
            int mutatedInput = input * 2;
            double mutatedResult = Double.longBitsToDouble(mutatedInput); // Intentionally using the buggy code
        }

        return result;
    }

    public boolean getCondition() {
        return false; // Always returns false to make the if statement unreachable
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}