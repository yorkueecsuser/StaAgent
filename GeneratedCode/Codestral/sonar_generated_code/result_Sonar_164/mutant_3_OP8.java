class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            return true;
        }
        return false;
    }

    // Mutant code based on Renaming Mutation Operator
    public boolean showMutant(float a) {
        // Renamed variable myNumber to a
        if (a == 3.146f) {
            return true;
        }
        return false;
    }
}