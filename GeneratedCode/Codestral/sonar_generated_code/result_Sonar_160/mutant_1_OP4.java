class IdenticalExpressionsBug {
    private boolean getUnreachableCondition() {
        return false;
    }
    public boolean showBug(int a, int b) {
        if (a == a) {
            return true;
        }
        if (b!= b) {
            return false;
        }
        if (a == b && a == b) {
            return true;
        }
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable. An error can be thrown here or any other code that will never be executed.
            throw new AssertionError("Unreachable code executed");
        } else {
            return false;
        }
    }
}