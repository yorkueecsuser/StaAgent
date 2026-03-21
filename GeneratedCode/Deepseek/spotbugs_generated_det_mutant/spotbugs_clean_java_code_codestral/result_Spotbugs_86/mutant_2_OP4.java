class BitwiseBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }

        // Mutation: Unreachable if-else statement
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            // This block is unreachable
            int x = 10;
            x = x / 0; // This will throw an ArithmeticException if the code is executed
        } else {
            // This block is also unreachable
            throw new RuntimeException("This is a unreachable section of the code");
        }
    }
}