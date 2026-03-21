class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            if (false && false && true && false && true && true && false && true && true && false && false) {boolean rjbdrtsl = true;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}