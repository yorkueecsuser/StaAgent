class DeadExceptionBug {
    // Original code
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }

    // Mutated code
    class AliveExceptionBug {
        public void showBug() {
            createDeadException(); // BUG: DeadException
        }
    }

    public static void main(String[] args) {
        AliveExceptionBug bug = new AliveExceptionBug();
        bug.showBug();
    }
}