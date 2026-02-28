class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) { // Original buggy line
            return true;
        }
        boolean unreachableCondition = getUnreachableCondition(); // Added line
        if (unreachableCondition) { // Mutant line: Unreachable if statement
            System.out.println("This line should never be executed");
        }
        return false;
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the if statement unreachable
    }
}