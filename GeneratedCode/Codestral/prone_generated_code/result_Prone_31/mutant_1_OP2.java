class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: Dead exception created but not thrown
        // Mutant: Duplication of the assignment statement
        createDeadException(); // Added mutant: Duplicated dead exception creation
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}