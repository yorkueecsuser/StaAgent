class DeadExceptionBug {
    public void showBug() {
        boolean unreachable = getCondition();
        if (unreachable) {
            // Unreachable branch
            System.out.println("This branch is unreachable");
        } else {
            createDeadException(); // BUG: DeadException
        }
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}