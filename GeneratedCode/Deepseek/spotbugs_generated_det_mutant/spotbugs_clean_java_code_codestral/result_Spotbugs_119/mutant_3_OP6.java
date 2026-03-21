class DoubleBitsBug {

    public double showBug(int input) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable for loop added according to Mutation Operator Information.
        }
        double result = Double.longBitsToDouble(input); // Original bug remains intact.
        return result;
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}