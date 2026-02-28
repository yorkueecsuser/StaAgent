class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }

        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is not executed because the condition is always false.");
        } else {
            // This else block is the one that will be executed.
            System.out.println("Condition evaluated to false.");
        }
    }

    private boolean getCondition() {
        return false; // Dynamic runtime condition, which is always false, ensuring the block is unreachable.
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}