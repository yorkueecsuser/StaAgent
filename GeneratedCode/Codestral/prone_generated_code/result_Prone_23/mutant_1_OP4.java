class ComparisonOutOfRangeBug {
    private boolean getUnreachableCondition() {
        // This method will always return false
        return false;
    }

    public boolean showBug(byte value) {
        // Original code
        boolean originalResult = value == 200;

        // Mutated code
        if (getUnreachableCondition()) {
            // This code will never be executed because getUnreachableCondition() always returns false
            System.out.println("This is an unreachable branch");
        } else {
            // This else branch is also unreachable but it's necessary to avoid the unreachable statement error
            System.out.println("This is the else branch of an unreachable if-else statement");
        }

        return originalResult;
    }
}