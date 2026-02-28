class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        boolean conditionFor = getCondition();
        // BUG: Unreachable for loop
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable code");
        }
        new NullPointerException("Dead exception created but not thrown");
    }

    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}