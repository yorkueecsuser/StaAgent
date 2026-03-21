class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            // Mutation: Insert an unreachable for loop
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // This code will never execute
            }
            return true;
        } else {
            return false;
        }
    }

    private boolean getCondition() {
        return false;
    }
}