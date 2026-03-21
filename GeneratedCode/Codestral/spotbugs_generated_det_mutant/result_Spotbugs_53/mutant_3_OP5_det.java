class ExceptionNotThrown {
    public void showBug(int x) {
        if (x < 0) {
            int vquhbzqr = 0;switch  (vquhbzqr) {case 1:char pfajpbej = 'y';break;default:byte ofmrbwlb = -16;break;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}

    public static void main(String[] args) {
        ExceptionNotThrown exceptionNotThrown = new ExceptionNotThrown();
        exceptionNotThrown.showBug(-5);
    }
}