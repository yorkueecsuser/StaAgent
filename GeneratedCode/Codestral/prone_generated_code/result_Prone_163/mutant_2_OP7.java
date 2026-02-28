class ThrowNullBug {
    public void showBug() {
        boolean condition = getCondition();
        while (condition) {
            // This is the unreachable while loop mutant
        }
        throw null; // BUG: ThrowNull
    }

    // This is a placeholder method, replace it with an actual implementation
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}