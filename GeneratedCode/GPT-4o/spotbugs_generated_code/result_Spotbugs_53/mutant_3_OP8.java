class ExceptionDemo {

    public void showBug(int y) {
        if (y < 0) {
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    }

    public static void main(String[] b) {
        ExceptionDemo a = new ExceptionDemo();
        a.showBug(-1);
    }
}