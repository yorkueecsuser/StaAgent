class ThrowNullBug {
    public void showBug() {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable because the condition is always false.
        }
        throw null;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        ThrowNullBug bug = new ThrowNullBug();
        bug.showBug();
    }
}