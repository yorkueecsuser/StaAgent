class IdenticalExpressionsBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(int a, int b) {
        if (a == a) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            while (getFalseCondition()) { // Unreachable while loop
                // This code will never be executed
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