class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        boolean conditionWhile = getCondition(); // Assume this method returns false
        while (conditionWhile) { // Unreachable while loop
            // This code will never be executed
        }

        if (a == a) {
            return true;
        }
        if (b!= b) {
            return false;
        }
        if (a == b && a == b) {
            return true;
        }
        return false;
    }

    private boolean getCondition() {
        return false;
    }
}