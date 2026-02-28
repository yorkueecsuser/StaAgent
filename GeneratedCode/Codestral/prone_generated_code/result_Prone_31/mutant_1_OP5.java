class DeadExceptionBug {
    public void showBug() {
        createDeadException(); // BUG: DeadException
    }

    private void createDeadException() {
        boolean shouldThrow = false;
        if (shouldThrow) {
            switch (1) { // Unreachable switch statement
                case 1:
                    System.out.println("This should never be printed.");
            }
        }
        new NullPointerException("Dead exception created but not thrown");
    }

    public static void main(String[] args) {
        DeadExceptionBug bug = new DeadExceptionBug();
        bug.showBug();
    }
}