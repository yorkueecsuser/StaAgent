class DoubleBitsBug {

    public double showBug(int input) {
        double result = Double.longBitsToDouble(input);

        // Mutant Code
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never execute");
                break;
            default:
                break;
        }

        return result;
    }

    private int getUnreachableValue() {
        return 0; // This value is not used in the switch case, hence the switch statement is unreachable.
    }

    public static void main(String[] args) {
        DoubleBitsBug bug = new DoubleBitsBug();
        int input = 1234567890;
        double result = bug.showBug(input);
        System.out.println("Result: " + result);
    }
}