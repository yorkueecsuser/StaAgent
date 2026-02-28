class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        int deadStore; // Dead Store: Unused variable declaration
        if (a == a) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        if (b!= b) { // Always false - Bug: Identical expressions should not be used on both sides of a binary operator
            deadStore = 10; // Dead Store: The variable is assigned a value but never used
            return false;
        }
        if (a == b && a == b) { // If the first one is true, the second one is too - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }
}