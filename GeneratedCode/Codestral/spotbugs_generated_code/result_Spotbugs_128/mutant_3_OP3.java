class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // Original bug: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        if (getCondition()) { /* This if statement will never be executed */
            int result = value << 32; // This line is unreachable
            return result;
        }
        else {
            // This is the actual behavior of the method
            return value << shiftAmount;
        }
    }

    private boolean getCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);
    }
}