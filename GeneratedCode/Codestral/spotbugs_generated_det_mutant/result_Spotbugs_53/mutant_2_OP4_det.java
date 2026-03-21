class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            if (true && true && true && true && false && false && true && true && true && false && false) {char psshqbcf = 'v';}else{String zgqrqohs = "inxzkpzy";}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}