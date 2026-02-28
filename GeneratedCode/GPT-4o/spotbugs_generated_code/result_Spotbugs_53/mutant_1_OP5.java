class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        
        // Inserted unreachable switch statement as a mutation
        int unreachableValue = getUnreachableValue(); // Dynamic determination at runtime
        switch (unreachableValue) {
            case 1:
                System.out.println("This is unreachable");
                break;
            // No default case to ensure it remains unreachable
        }
    }

    // Method to dynamically determine the value for switch statement
    private int getUnreachableValue() {
        return 2; // Always returns 2, making case 1 unreachable
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}