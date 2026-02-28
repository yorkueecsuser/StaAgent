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
            if (getUnreachableCondition()) {
                // Unreachable code
                System.out.println("This line should not be executed.");
            } else {
                return true;
            }
        }
        return false;
    }
}