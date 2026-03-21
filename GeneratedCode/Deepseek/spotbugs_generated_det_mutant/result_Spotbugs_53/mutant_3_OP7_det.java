class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = -5;
        if (x < 0) {
            boolean dtemlcha = false;while (dtemlcha && false && false && true && false && false && true && false && false && true && false && false) {float yjbpqkgl = -238084952;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}
}