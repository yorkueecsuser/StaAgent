class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        boolean shouldLoop = getCondition();
        for (int i = 0; shouldLoop; i++) { // Inserted unreachable for loop
            System.out.println("This loop will never execute");
        }
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