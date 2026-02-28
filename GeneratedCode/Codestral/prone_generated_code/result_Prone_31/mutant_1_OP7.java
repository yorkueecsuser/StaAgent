class DeadExceptionBug {
    public void showBug() {
        boolean loopCondition = getCondition();
        while (loopCondition) {
            // Unreachable while loop mutant
        }
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    private boolean getCondition() {
        return false; // Always returns false to make the loop unreachable
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}