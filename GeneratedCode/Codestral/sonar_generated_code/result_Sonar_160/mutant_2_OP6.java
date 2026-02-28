class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        if (a == a) {
            // Inserted unreachable for loop
            boolean unreachableCondition = getUnreachableCondition();
            for (int i = 0; unreachableCondition; i++) {
                // This code will never be executed
            }
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

    // Method that returns false
    private boolean getUnreachableCondition() {
        return false;
    }
}