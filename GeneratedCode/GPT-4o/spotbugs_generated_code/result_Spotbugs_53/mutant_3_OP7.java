class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // This block is unreachable because conditionWhile is false
            }
        }
    }

    private boolean getCondition() {
        return false; // This makes the while loop condition always false
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}