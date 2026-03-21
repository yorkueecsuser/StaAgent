class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            if (false && true && false && true && true && true && false && false && false && true && false) {char wxemisrp = 'h';}else{int lgpwugge = 46710879;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}