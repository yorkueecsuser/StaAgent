class ExceptionNotThrown {
    public void showBug(int y) {
        if (y < 0) {
            new IllegalArgumentException("y must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
        int x = y; // Added code for variable renaming
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}