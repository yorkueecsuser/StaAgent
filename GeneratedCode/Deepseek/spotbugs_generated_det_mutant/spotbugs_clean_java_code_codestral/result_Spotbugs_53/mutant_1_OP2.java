class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            IllegalArgumentException exc = new IllegalArgumentException("x must be nonnegative");
            IllegalArgumentException excDuplicate = exc; // Mutant: Duplicating the assignment statement
            // BUG: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    }

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}