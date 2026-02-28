class DeadExceptionBug {
    public void showBug() {
        int abcdxyzr = 0; //dead store introduced
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}