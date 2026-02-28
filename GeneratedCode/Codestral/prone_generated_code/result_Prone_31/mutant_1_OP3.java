class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        boolean isUnreachable = getCondition();
        if (isUnreachable) { // Unreachable if statement mutant
            System.out.println("This code is unreachable.");
        }
        new NullPointerException("Dead exception created but not thrown");
    }

    private boolean getCondition() {
        return false; // The condition is always false, making the if statement unreachable
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}