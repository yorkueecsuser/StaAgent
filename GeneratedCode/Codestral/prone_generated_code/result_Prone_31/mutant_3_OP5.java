class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
        unreachableSwitchStatement();
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    private void unreachableSwitchStatement() {
        boolean alwaysFalse = getCondition();
        if (!alwaysFalse) {
            int value = 0;
            switch (value) {
                case 1:
                    // This is an unreachable case
                    System.out.println("Unreachable case executed");
                    break;
            }
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}