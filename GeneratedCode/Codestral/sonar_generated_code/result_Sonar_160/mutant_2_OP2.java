class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        a = a; // Duplicate this line
        if (a == a) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }

        a = a; // Duplicated line

        if (b!= b) { // Always false - Bug: Identical expressions should not be used on both sides of a binary operator
            return false;
        }

        a = a; // Duplicated line

        if (a == b && a == b) { // If the first one is true, the second one is too - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }
}