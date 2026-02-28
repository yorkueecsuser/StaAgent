class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        if (a == a) { // Always true - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        if (b!= b) { // Always false - Bug: Identical expressions should not be used on both sides of a binary operator
            return false;
        }
        if (a == b && a == b) { // If the first one is true, the second one is too - Bug: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        else {
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                System.out.println("This branch should never be reached.");
            }
        }
        return false;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}