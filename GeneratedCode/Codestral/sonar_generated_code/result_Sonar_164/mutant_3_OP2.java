class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        if (myNumber == 3.146f) {
            return true;
        }
        // Mutated code - Duplication of assignment statement
        float myNumberDuplicate = myNumber;
        if (myNumberDuplicate == 3.146f) { // Duplicated if statement
            return true;
        }
        return false;
    }
}