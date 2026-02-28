class BitwiseOperationBug {
    private static final int CONSTANT = -1;

    private boolean getCondition() {
        return false;
    }

    public boolean showBug(int val) {
        if (getCondition()) {
            // Unreachable code
            int x = 10;
        } else {
            // Original bug-prone code
            return ((val & CONSTANT) > 0);
        }
    }
}