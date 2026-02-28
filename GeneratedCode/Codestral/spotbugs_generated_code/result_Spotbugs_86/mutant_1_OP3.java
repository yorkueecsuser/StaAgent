class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            return true;
        } else {
            return false;
        }

        // MUTANT: Unreachable if statement
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            // This code is unreachable
            System.out.println("Unreachable code executed!");
        }
    }

    // Method to ensure the condition is always false
    private boolean getCondition() {
        return false;
    }
}