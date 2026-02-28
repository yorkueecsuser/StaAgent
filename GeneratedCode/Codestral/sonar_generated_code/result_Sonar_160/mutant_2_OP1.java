class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        int deadStoreVariable = 0;

        if (a == a) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            deadStoreVariable++;
            return true;
        }
        if (b!= b) { // Always false - Bug: Identical expressions should not be used on both sides of a binary operator
            return false;
        }
        if (a == b && a == b) { // If the first one is true, the second one is too - Bug: Identical expressions should not be used on both sides of a binary operator
            deadStoreVariable--;
            return true;
        }
        return false;
    }
}