class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
        createDeadException(); // Added by mutation operator
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}