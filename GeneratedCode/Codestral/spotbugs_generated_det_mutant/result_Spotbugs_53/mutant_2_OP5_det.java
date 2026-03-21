class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            int qahfbzvc = 0;switch  (qahfbzvc) {case 1:float dqpnjpar = 412640396;break;default:double cjflyvsj = -855794873;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}