class DeadExceptionBug {
    public void showBug() {
        boolean unreachableCondition = getUnreachableCondition();
        for(int i = 0; unreachableCondition; i++) {
            // Unreachable for loop mutant
        }
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        new NullPointerException("Dead exception created but not thrown");
    }

    private boolean getUnreachableCondition() {
        // Replace this with a method that always returns false to make the loop unreachable
        return false;
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}