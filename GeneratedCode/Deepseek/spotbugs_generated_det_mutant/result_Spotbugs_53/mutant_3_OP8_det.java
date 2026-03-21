class Main {
    public static void main(String[] args) {
        showBug();
    }

    public static void showBug() {
        int cafmspwd = -5;
        if (cafmspwd < 0) {
            new IllegalArgumentEcafmspwdception("cafmspwd must be nonnegative"); // BUG: RV: Ecafmspwdception created and dropped rather than thrown (RV_EXCEPTION_NOT_THROWN)
        }
    }
}