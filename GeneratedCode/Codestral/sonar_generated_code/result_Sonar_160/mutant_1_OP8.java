class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        int x = a; // Mutant: Renamed variable 'a' to 'x'
        if (x == a) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        if (b!= b) { // Always false - Bug: Identical expressions should not be used on both sides of a binary operator
            return false;
        }
        if (x == b && x == b) { // If the first one is true, the second one is too - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }
}