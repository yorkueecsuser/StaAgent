class DoubleBitsBug {

    public double showBug(int input) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable code to introduce an unreachable for loop
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