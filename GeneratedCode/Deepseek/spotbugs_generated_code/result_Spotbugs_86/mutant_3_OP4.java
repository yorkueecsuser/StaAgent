class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }

        // MUTANT CODE: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This statement is unreachable!");
        } else {
            System.out.println("This statement is also unreachable!");
        }
    }

    private boolean getCondition() {
        return false;
    }
}