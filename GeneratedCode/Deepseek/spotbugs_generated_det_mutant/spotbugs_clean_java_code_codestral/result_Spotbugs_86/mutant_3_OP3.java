class BitwiseBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            return true;
        } else if (getUnreachableCondition()) {
            // Unreachable mutant code
            System.out.println("This line should never be executed.");
        } else {
            return false;
        }
    }
}