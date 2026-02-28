class DoubleBitsBug {

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input);

        // Added unreachable while loop
        while (checkCondition()) {
            // This loop is unreachable as checkCondition() always returns false
            System.out.println("Unreachable code.");
        }

        return result;
    }

    private boolean checkCondition() {
        return false; // Always returns false to make the while loop unreachable
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}