class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        if (getUnreachableCondition()) {
            // Adding unreachable if-else statement
            System.out.println("This code is unreachable");
        } else {
            System.out.println("This code is also unreachable");
        }

        // Original bug: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << shiftAmount;
    }

    // Method to generate a compile-time unknown condition
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}