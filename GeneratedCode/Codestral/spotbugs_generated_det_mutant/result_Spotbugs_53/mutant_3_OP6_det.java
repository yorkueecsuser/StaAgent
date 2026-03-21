class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            for  (int mmtinpvo = 0; mmtinpvo < 0; mmtinpvo++) {float vseuftzc = 610633610;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}