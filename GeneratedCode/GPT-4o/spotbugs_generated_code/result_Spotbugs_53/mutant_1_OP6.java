class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        
        // Unreachable for loop mutant
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
    }

    private boolean getCondition() {
        return false; // Dynamically determined to ensure the loop is unreachable but doesn't cause a compile-time error
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}