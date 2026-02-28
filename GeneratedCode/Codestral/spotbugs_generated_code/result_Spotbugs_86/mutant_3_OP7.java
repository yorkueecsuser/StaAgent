class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            return true;
        } else {
            // Mutation Operator: Unreachable while loop
            boolean shouldRun = getCondition();
            while (shouldRun) {
                // This loop is unreachable because the condition is always false
                System.out.println("Unreachable loop");
            }
            return false;
        }
    }

    private boolean getCondition() {
        // This method should return false to make the loop unreachable
        return false;
    }
}