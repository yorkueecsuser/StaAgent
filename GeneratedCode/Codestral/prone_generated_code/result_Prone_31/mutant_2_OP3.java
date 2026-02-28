class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");

        // Mutant code: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("Unreachable code");
        }
    }

    // Helper method to return false dynamically
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}