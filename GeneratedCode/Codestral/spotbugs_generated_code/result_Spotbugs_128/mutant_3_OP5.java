class BadShiftBug {

    public int showBug(int value, int shiftAmount) {
        // BUG: BSHIFT: 32 bit int shifted by an amount not in the range -31..31 (ICAST_BAD_SHIFT_AMOUNT)
        return value << shiftAmount;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BadShiftBug bug = new BadShiftBug();
        int result = bug.showBug(1, 32);
        System.out.println("Result: " + result);

        // Mutant code to introduce unreachable switch statement
        boolean condition = bug.getCondition();
        if (condition) {
            int value = 0; // This value is not used, it's just for the switch statement to compile
            switch (value) {
                case 1:
                    System.out.println("This line is unreachable");
                    break;
            }
        }
    }
}