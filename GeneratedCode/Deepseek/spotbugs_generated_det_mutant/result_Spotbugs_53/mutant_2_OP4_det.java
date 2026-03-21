class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = -5;
        if (x < 0) {
            if (false && true && false && false && false && false && true && false && false && true && false) {short wgeshedn = -4294;}else{char weovvlyd = 'y';}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}
}