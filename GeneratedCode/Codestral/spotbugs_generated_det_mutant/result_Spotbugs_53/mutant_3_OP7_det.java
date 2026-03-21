class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            boolean jbmsxkpf = false;while (jbmsxkpf && true && false && false && true && true && false && true && false && true && false && false) {float uhlaorbk = -275670303;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}