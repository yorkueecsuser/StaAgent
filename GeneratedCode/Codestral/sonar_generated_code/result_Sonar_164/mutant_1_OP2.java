class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        if (myNumber == 3.146f) {
            return true;
        }
        // Mutant code: Duplicating the assignment statement
        if (myNumber == 3.146f) {
            return true;
        }
        return false;
    }
}