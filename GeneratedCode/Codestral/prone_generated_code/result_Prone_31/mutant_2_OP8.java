class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        Exception e = new NullPointerException("Dead exception created but not thrown");
        // added new variable 'e' to rename 'NullPointerException'
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}