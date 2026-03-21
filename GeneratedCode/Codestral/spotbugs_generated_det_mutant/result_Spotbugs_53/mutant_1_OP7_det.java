class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            boolean bwujrwjx = false;while (bwujrwjx && false && true && false && false && true && true && true && true && false && false && false) {int hcnmwrhb = 217435924;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}