class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }

        // Unreachable while loop with a non-final variable condition
        boolean conditionWhile = determineCondition(); // Simulating a condition
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
            break; // Ensure the loop can terminate if condition changes
        }
    }

    private boolean determineCondition() {
        return false; // Ensures the while loop is never entered
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}