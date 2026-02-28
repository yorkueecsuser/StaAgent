class ExceptionDemo {

    public void showBug(int x) {
        if (x < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        int abcdefgh = 42; // Dead store: unused variable declaration
    }

    public static void main(String[] args) {
        ExceptionDemo demo = new ExceptionDemo();
        demo.showBug(-1);
    }
}