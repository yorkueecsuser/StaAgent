class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            return true;
        }

        // Mutant Code: Duplication of assignment statement
        float myNumberDuplicate = myNumber;
        if (myNumberDuplicate == 3.146f) {
            return true;
        }

        return false;
    }
}