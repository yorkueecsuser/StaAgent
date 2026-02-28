class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");

        // Mutant: Add an unreachable while loop
        boolean isLoopConditionFalse = getCondition();
        while (isLoopConditionFalse) {
            // This code will never be executed
            System.out.println("Unreachable code");
        }
    }

    private boolean getCondition() {
        // Return false to make the loop condition unreachable
        return false;
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}