class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        int x = a; // Mutant code: renamed 'a' to 'x'
        int y = b; // Mutant code: renamed 'b' to 'y'

        if (x == x) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        if (y!= y) { // Always false - Bug: Identical expressions should not be used on both sides of a binary operator
            return false;
        }
        if (x == y && x == y) { // If the first one is true, the second one is too - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }
}