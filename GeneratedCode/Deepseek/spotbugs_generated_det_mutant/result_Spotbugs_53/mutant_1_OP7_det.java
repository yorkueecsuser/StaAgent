class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int x = -5;
        if (x < 0) {
            boolean kkfuaheh = false;while (kkfuaheh && false && true && false && false && true && true && true && true && true && false && false) {boolean zmrcysca = false;}
            new IllegalArgumentException("x must be nonnegative"); // BUG: RV: Exception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    
}
}