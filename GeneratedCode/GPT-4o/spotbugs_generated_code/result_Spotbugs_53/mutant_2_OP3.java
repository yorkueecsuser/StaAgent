class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }

        // Mutant: Adding an unreachable if statement
        boolean alwaysFalseCondition = getAlwaysFalseCondition();
        if (alwaysFalseCondition) {
            System.out.println("This will never print");
        }
    }

    // Helper method to ensure the condition is not a compile-time constant
    private boolean getAlwaysFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}