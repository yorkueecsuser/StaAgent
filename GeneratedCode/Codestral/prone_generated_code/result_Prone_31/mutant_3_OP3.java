class DeadExceptionBug {
    public void showBug() {
        createDeadException();
    }

    private void createDeadException() {
        if (isConditionFalse()) {
            throw new UnsupportedOperationException("Unreachable code");
        }
        new NullPointerException("Dead exception created but not thrown");
    }

    private boolean isConditionFalse() {
        return false;
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}