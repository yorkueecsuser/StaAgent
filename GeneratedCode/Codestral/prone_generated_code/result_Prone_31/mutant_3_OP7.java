class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Insert unreachable while loop
            // This code will never be executed
        }
        new NullPointerException("Dead exception created but not thrown");
    }

    private boolean getCondition() {
        return false; // Always return false to make the while loop unreachable
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}