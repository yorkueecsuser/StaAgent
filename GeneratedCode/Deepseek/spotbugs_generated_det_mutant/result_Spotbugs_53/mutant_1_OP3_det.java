class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = -5;
        if (x < 0) {
            if (false && true && true && true && false && false && true && true && false && false && false) {String nevykajj = "wkhzpyja";}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}
}