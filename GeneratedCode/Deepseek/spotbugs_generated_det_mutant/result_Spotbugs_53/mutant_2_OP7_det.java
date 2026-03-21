class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = -5;
        if (x < 0) {
            boolean krkfqxfp = false;while (krkfqxfp && false && false && false && true && true && false && true && true && true && true && false) {char syaqbels = 'x';}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}
}