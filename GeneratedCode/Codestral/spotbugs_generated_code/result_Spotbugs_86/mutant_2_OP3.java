class BitwiseBug {
    public boolean showBug(int number) {
        // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
        if ((number & 0) == 0) {
            return true;
        } else {
            // Mutation Operator: Unreachable if statement
            boolean unreachableCondition = isUnreachable();
            if (unreachableCondition) {
                // This branch is always unreachable
                System.out.println("This line should never print");
            }
            return false;
        }
    }

    private boolean isUnreachable() {
        return false;
    }
}