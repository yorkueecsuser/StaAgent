class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        if (a == a) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            // Added mutant: Duplication of the assignment statement
            if (a == a) { // Duplicate of the previous assignment statement
                return true;
            }
            return true;
        }
        if (b!= b) { // Always false - Bug: Identical expressions should not be used on both sides of a binary operator
            return false;
        }
        if (a == b && a == b) { // If the first one is true, the second one is too - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }
}