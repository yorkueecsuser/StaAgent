class ExceptionDemo {

    public void showBug(int x) {
        boolean unreachableCondition = false; // Variable used to simulate unreachable code
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        
        // Unreachable if statement using a non-final variable
        if (unreachableCondition) {
            System.out.println("This code is unreachable.");
        }
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}