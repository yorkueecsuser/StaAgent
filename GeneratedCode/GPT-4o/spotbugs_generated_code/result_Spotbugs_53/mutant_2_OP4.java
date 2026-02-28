class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        
        // Unreachable if-else statement mutation
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This message will never be printed.");
        } else {
            System.out.println("This is the reachable branch.");
        }
    }

    private boolean getCondition() {
        return false; // This ensures the if-block is never executed
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}