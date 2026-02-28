class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        if (getCondition()) {
            switch (getValue()) {
                case 1:
                    // Unreachable code
                    break;
            }
        }
        new NullPointerException("Dead exception created but not thrown");
    }

    private boolean getCondition() {
        return false;
    }

    private int getValue() {
        return 0;
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}