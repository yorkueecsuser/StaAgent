class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
        if (getUnreachableCondition()) {
            System.out.println("Unreachable code");
        } else {
            System.out.println("Alternative code");
        }
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}